package com.entradas.app;

import java.util.Scanner;       

public class App {
    public static void main(String[] args) throws Exception {
    //    instância do objeto leia
        Scanner leia = new Scanner(System.in);
        
        // declaração de variáveis
        String nome;
        int idade;
        double altura;
        String email;

        //entrada de dados  

        System.out.println( "Informe seu nome: ");
        nome = leia.nextLine();
        
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt(); 

        System.out.println("Informe sua altura: ");
        altura = leia.nextDouble();

 //limpeza do buffer
        leia.nextLine();
        
        System.out.println( "Informe seu e-mail: ");
        email = leia.nextLine();

        

        //saida de dados 

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade + " anos");
        System.out.println("Sua altura é: " + altura + " m");
        System.out.println("Seu e-mail é: " + email);
       
       
      

        //fecha objeto close
        leia.close();

    }
}