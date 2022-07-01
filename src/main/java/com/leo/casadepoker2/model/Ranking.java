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
@Table(name = "ranking")
public class Ranking {

    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer maxPlayers;
    private LocalDateTime createdAt;
    private Double pontos;
}
