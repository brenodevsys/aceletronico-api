package com.aceletronicos.aceletronicosapi.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_ESTOQUE")
public class Estoque {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Integer quantidade;

    @Column(nullable = false)
    private Double valorTotalEstoque;

}
