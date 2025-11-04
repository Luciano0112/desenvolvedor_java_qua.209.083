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
        String filme ="";
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
            
        switch (sala) {
            case "1":
                filme = salas[0];
                idadeMinima = 0;
                break;
            case "2":
                filme = salas[1];
                idadeMinima = 12;
                break;
            case "3":
                 filme = salas[2];
                idadeMinima = 14;
                break;
            case "4":
             filme = salas[3];
             idadeMinima = 16;
             break;
           case "5":
             filme = salas[4];
             idadeMinima = 18;
             break;
          default:
          System.out.println("Sala Inexistente");
      }    
        
        //verificação da idade
        if (idade>= idadeMinima) {
            System.out.println("Filme escolhido: " + filme);
            System.out.println("Tenha um bom filme, " + nome);
            System.out.println("👍");
        }
        else{
            System.out.println("Entrada não permitida");
            System.out.println("Escolha outro filme");
            System.out.println("📌");
        }
    
    } while (idade < idadeMinima);


        //fecha objeto leia
        leia.close();


       }
}
