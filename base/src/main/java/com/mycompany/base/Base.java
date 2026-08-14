


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula12082026;

/**
 *
 * @author alunolab11
 */
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(1,1,1000.00);
        Conta c2 = new Conta(1,2,890.00);
        
        c1.creditar(800);
        c2.debitar(900);
        c1.transferir(1500, c2);
        
        System.out.println("O saldo da Conta 1: " + c1.getSaldo());
        System.out.println("O saldo da Conta 2: " + c2.getSaldo());
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula12082026;

/**
 *
 * @author alunolab11
 */
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

       
    
    Conta(){
        
    }
    
    Conta(int agencia, int numero) {
        this.agencia = agencia;
        this.numero = numero;
        
    }
    
    Conta(int agencia, int numero, double saldo){
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    
    void creditar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
            //System.out.println("Crédito Realizado!");
        }else{
            System.out.println("Valor Inválido!");
        }
    }
    
    boolean debitar(double valor){
        if(valor > 0 && valor <= saldo){
        saldo = saldo - valor;    
        //System.out.println("Débito Realizado!");
        return true;
        }else{
            System.out.println("Saldo Insuficiente!");
        return false;    
        }
    }
    
    void transferir(double valor, Conta destino){
        if(debitar(valor)){
            destino.creditar(valor);
            //System.out.println("Transferência Realizada!");
        }else{
            System.out.println("Transferência Negada!");
                    
                    
        }
    
    }
    
    
    
}


________________________________________________________________________________________________________



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula12082026;

/**
 *
 * @author alunolab11
 */
public class Principal {

    public static void main(String[] args) {
        Conta c1 = new Conta(1,1,1000.00);
        Conta c2 = new Conta(1,2,890.00);
        
        c1.creditar(800);
        c2.debitar(900);
        c1.transferir(1500, c2);
        
        System.out.println("O saldo da Conta 1: " + c1.getSaldo());
        System.out.println("O saldo da Conta 2: " + c2.getSaldo());
    }
}



