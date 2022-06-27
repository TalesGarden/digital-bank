package com.digitalinovation.banco;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

}
