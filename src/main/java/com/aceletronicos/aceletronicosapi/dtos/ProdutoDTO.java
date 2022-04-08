package com.aceletronicos.aceletronicosapi.dtos;

import lombok.Data;

import javax.persistence.Column;

@Data
public class ProdutoDTO {


    private String nome;
    private String tipo;
    private Double preco;
}
