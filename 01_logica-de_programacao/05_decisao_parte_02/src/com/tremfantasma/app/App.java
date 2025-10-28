package com.tremfantasma.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //instancia a classe Scanner
    Scanner leia = new Scanner(System.in);

    //declara as variaveis
        String nome;
        int idade;
        double altura;

        //entrada de dados
        System.out.println("Digite seu nome: ");
        nome = leia.nextLine();
        System.out.println("Digite sua idade: ");
        idade = leia.nextInt();     
        System.out.println("Digite sua altura: ");
        altura = leia.nextDouble(); 
         
        //estrutura de decisão
        if (idade >= 14 && altura >= 1.5) {
            System.out.println(nome + "foi liberado.");
        } 
        else {
            System.out.println(nome + "não foi autorizado.");
        }
        //fechando o objeto Scanner
    leia.close();
       
    }
}
