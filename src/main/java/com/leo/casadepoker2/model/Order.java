package com.leo.casadepoker2.model;

import com.leo.casadepoker2.model.enums.OrderStatus;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static com.leo.casadepoker2.model.enums.OrderStatus.*;
import static javax.persistence.GenerationType.IDENTITY;


@Entity
@NoArgsConstructor
@Table(name = "my_order")
public class Order extends Model{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Getter
    private Long id;

    private LocalDateTime date;

    @OneToMany(mappedBy = "order")
    @Getter
    private List<OrderItem> itens;

    @Setter
    private OrderStatus status;

    @ManyToOne
    private Funcionario funcionario;

    public Order(Funcionario funcionario) {
        this.funcionario = funcionario;
        this.date = LocalDateTime.now();
        this.itens = new ArrayList<>();
        this.status = OPENED;
    }
}