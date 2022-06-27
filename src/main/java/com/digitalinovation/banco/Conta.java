package com.digitalinovation.banco;

import lombok.Getter;

import java.util.UUID;

@Getter
public abstract class Conta implements Iconta{

    private static final int AGENCIA_PADRAO = 1;

    protected Integer agencia;
    protected String numero;
    protected Double saldo = (double) 0;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = UUID.randomUUID().toString();
    }

    @Override
    public void depositar(Double valor) {
        if (valor <= 0 )
            return;

        this.saldo += valor;
    }

    @Override
    public Boolean sacar(Double valor) {

        if (this.saldo < valor)
        {
            System.out.println("Você não possui saldo suficiente na conta");
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    @Override
    public void transferir(Double valor, Conta contaDeposito) {

        if (!this.sacar(valor))
        {
            System.out.println("Transferência Cancelada");
            return;
        }

        if (contaDeposito == null)
        {
            System.out.println("A conta para depósito não é válida");
            return;
        }

        contaDeposito.saldo += valor;
    }



    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %s", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero='" + numero + '\'' +
                ", saldo=" + saldo +
                ", cliente=" + cliente.getNome() +
                '}';
    }
}
