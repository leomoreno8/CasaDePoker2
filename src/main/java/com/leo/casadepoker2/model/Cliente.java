package com.leo.casadepoker2.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "cliente")
public class Cliente {

    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nickName;
    private String name;
    private String lastName;
    private String position;
    private String isIGL;
    private String age;

    @ManyToOne //muitos clientes pra uma mesa
    @JoinColumn(name = "cliente_mesa_id")
    private Tables tables;

}
