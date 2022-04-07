package com.aceletronicos.aceletronicosapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "TB_CLIENTE")
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 130)
    private String nome;

    @Column(nullable = false, unique = true, length = 130)
    private String email;

    @Column(nullable = false, unique = true, length = 130)
    private String telefone;


}
