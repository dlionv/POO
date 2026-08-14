package com.mycompany.aula12082026;

public class Conta {
    private int agencia, numero;
    private double saldo;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Conta() {
    }

    public Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
    }

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public void creditar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            System.out.println("Valor Inválido!");
        }
    }

    public boolean debitar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            return true;
        } else {
            System.out.println("Saldo Insuficiente!");
            return false;
        }
    }

    public void transferir(double valor, Conta destino) {
        if (debitar(valor)) {
            destino.creditar(valor);
        } else {
            System.out.println("Transferência Negada!");
        }
    }
}