/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastrofuncionarioo;

/**
 *
 * @author rocha
 */
public class Desenvolvedor extends Funcionario {
        private int horasExtras;
    private static final double VALOR_HORA = 50;

    public Desenvolvedor(String nome, String matricula, double salarioBase, int horasExtras) {
        super(nome, matricula, salarioBase);
        this.horasExtras = horasExtras;
    }

    public double getSalarioFinal() {
        return salarioBase + (horasExtras * VALOR_HORA);
    }

    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Cargo: Desenvolvedor");
        System.out.println("Horas Extras: " + horasExtras);
    }
}
