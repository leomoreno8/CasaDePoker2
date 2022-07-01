package com.leo.casadepoker2.model;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Funcionario {
    @Id
    @GeneratedValue
    @Type(type = "uuid-char")
    private UUID uuid;
    private String name;
    private int funcao;
    // 1 = Dealer
    // 2 = Garçom
    // 3 = Fichas Guy
}