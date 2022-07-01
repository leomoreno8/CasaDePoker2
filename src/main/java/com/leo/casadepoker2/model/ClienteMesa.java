package com.leo.casadepoker2.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ClienteMesa")

public class ClienteMesa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;

    @OneToMany(mappedBy = "clienteMesa", cascade = CascadeType.ALL)
    private List<Cliente> cliente;
}
