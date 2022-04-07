package com.aceletronicos.aceletronicosapi.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "TB_PRODUTO")
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 130)
    private String nome;

    @Column(nullable = false, length = 130)
    private String tipo;

    @Column(nullable = false)
    private Double preco;

}
