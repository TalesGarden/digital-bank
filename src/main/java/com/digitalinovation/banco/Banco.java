package com.digitalinovation.banco;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Banco {

    private static Banco single_instance = null;
    private String nome;
    private List<Conta> contas;

    private  Banco() {
    }

    public static Banco getInstance()
    {
        if (single_instance == null)
            return single_instance = new Banco();

        return single_instance;
    }


    public void imprimeClientes()
    {
        this.contas.forEach(System.out::println);
    }


}
