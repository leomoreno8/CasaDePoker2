package com.leo.casadepoker2.model;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "round")
public class Round {

    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private ClienteMesa UM;
    @OneToOne
    private ClienteMesa DOIS;
    @OneToOne
    private ClienteMesa TRES;
    @OneToOne
    private ClienteMesa QUATRO;
    @OneToOne
    private ClienteMesa CINCO;
    @OneToOne
    private Tables tables;

    private LocalDateTime createdAt;
    private LocalDateTime occurredAt;

}
