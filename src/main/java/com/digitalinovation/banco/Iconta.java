package com.digitalinovation.banco;

public interface Iconta {

    void depositar(Double valor);

    Boolean sacar(Double valor);

    void transferir(Double valor, Conta contaDeposito);

    void imprimirExtrato();

}
