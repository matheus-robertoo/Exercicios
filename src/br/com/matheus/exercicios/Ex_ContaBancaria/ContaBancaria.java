package br.com.matheus.exercicios.Ex_ContaBancaria;

import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {

        List<ContaBancaria> contas = new ArrayList<ContaBancaria>();

        contas.add (new ContaBancaria(11111, 1000.00));
        contas.add (new ContaBancaria(22222, 200.00));
        contas.add (new ContaBancaria(33333, 1200.00));
        contas.add (new ContaBancaria(44444, 2200.00));
        contas.add (new ContaBancaria(55555, 258.63));


        double maiorSaldo = 0;
        int numeroConta = 0;

        for (ContaBancaria conta : contas) {
            if(conta.getSaldo() > maiorSaldo){
                maiorSaldo = conta.getSaldo();
                numeroConta = conta.getNumeroConta();
            }
        }

        System.out.println("A conta com maior saldo é: " + numeroConta + " e o seu valor: " + maiorSaldo+" R$." );

    }
}

//TESTE