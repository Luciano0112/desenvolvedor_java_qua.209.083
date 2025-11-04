package com.atividade04.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia a classe Scanner       
        Scanner leia = new Scanner(System.in);

        //declaração de variáveis
        String[] salas = new String[5];
        String nome;
        String sala;
        int idade;
        int idadeMinima = 0;

        //inicializar o array
        salas[0] = "A Roda Quadrada";
        salas[1] = "A Volta dos Que Não Foram";
        salas[2] = "Poeira em Alto Mar";
        salas[3] = "As Tranças do Rei Careca";
        salas[4] = "A Vinganca do Peixe Frito";

        //entrada de dados
        System.out.println("Informe o nome:");
        nome = leia.nextLine();
        System.out.println("Informe a idade:");
        idade = leia.nextInt();

        //limpeza de buffer
        leia.nextLine();

        //loop
        do {
            //menu
            System.out.println("Sala 1 - " + salas[0] + " - Livre");
            System.out.println("Sala 2 - " + salas[0] + " - 12 anos");
            System.out.println("Sala 3 - " + salas[0] + " - 14 anos");
            System.out.println("Sala 4 - " + salas[0] + " - 16 anos");
            System.out.println("Sala 5 - " + salas[0] + " - 18 anos");
            System.out.println("Informe a sala desejada:");
            sala = leia.nextLine();
            
            //TODO:TERMINAR  O PROGRAMA
        } while (idade < idadeMinima);


        //fecha objeto leia
        leia.close();


       }
}
