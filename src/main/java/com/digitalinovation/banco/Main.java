package com.digitalinovation.banco;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Cliente primeiroCliente = new Cliente("JOÃO");
        Cliente segundoCliente = new Cliente("Carlos");

        Conta contaPoupanca = new ContaPoupanca(primeiroCliente);
        Conta contaCorrente = new ContaCorrente(segundoCliente);

        contaPoupanca.sacar(50.0);
        contaPoupanca.depositar(150.0);

        contaPoupanca.sacar(1000.0);
        contaPoupanca.transferir(100.0, contaCorrente);


        List<Conta> contas = new ArrayList<>();
        contas.add(contaCorrente);
        contas.add(contaPoupanca);

        Banco bancoPrincipal = Banco.getInstance();

        bancoPrincipal.setContas(contas);
        bancoPrincipal.imprimeClientes();
    }
}
