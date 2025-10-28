package com.maioridade.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        //declaração de variáveis
        String nome;
        int idade;

        //etrada de dados
        System.out.print("Informe o nome: ");
        nome = leia.nextLine();

        System.out.print("Informe a idade: ");
        idade = leia.nextInt();

        //estrutura de decisão
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade.");
        } 
        else {
            System.out.println(nome + " é menor de idade.");
        }

        //fecha objeto Leia
        leia.close();
    }
}
