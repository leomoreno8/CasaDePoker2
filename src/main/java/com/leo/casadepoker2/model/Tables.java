package com.leo.casadepoker2.model;

import com.leo.casadepoker2.model.enums.OrderStatus;
import lombok.*;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


import static com.leo.casadepoker2.model.enums.OrderStatus.OPENED;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
@Table(name = "my_order")
public class Tables extends Model {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Getter
    private Long id;

    private LocalDateTime date;
    private Round jogadores;
    @OneToMany(mappedBy = "order")
    @Getter
    private List<OrderItem> itens;

    @Setter
    private OrderStatus status;

    @ManyToOne
    private Funcionario funcionario;

    @ManyToOne
    private Round round;

    @OneToMany(mappedBy = "clienteMesa", cascade = CascadeType.ALL)
    private List<Cliente> cliente;

    public Tables(Funcionario funcionario, Round round) {
        this.funcionario = funcionario;
        this.date = LocalDateTime.now();
        this.itens = new ArrayList<>();
        this.jogadores = round;
        this.status = OPENED;
    }

}
