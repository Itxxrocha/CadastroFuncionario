/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrofuncionarioo;

/**
 *
 * @author rocha
 */
public class Gerente extends Funcionario {
    
    private static final double BONUS = 2000.0;

    public Gerente(String nome, String matricula, double salarioBase) {
        super(nome, matricula, salarioBase);
    }

    public double getSalarioFinal() {
        return salarioBase + BONUS;
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Cargo: Gerente");
    }
}
