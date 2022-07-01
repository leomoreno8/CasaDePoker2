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
@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
@Table(name = "tournament")
public class Tournament extends Model{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Getter
    private Long id;
    private LocalDateTime date;
    private String nome;

    @OneToMany(mappedBy = "tournament")
    @Getter
    private List<OrderItem> itens;
    private List<Tables> tables;


    @Setter
    private OrderStatus status;

    @ManyToOne
    private Funcionario funcionario;

    public Tournament(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.date = LocalDateTime.now();
        this.tables = new ArrayList<>();

        this.itens = new ArrayList<>();
        this.status = OPENED;
    }
}


