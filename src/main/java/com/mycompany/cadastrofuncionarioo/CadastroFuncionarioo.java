/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastrofuncionarioo;

/**
 *
 * @author rocha
 */
public class CadastroFuncionarioo {

    public static void main(String[] args) {
         Gerente g1 = new Gerente("Carlos Silva", "G001", 8000);
        Desenvolvedor d1 = new Desenvolvedor("Ana Souza", "D001", 5000, 10);

        System.out.println("GERENTE");
        g1.imprimirDados();

        System.out.println();

        System.out.println("DESENVOLVEDOR");
        d1.imprimirDados();
    }
}
