package com.atividade01.app;

import java.util.Scanner; 
//import java.time.LocalDate; 

public class App {
    public static void main(String[] args) throws Exception {
        //TODO:atividade
        /*!SECTION
         *Crie um programa que receba do usuário :
         *nome
         *Data de Nasc
         *CPF
         *E-MAIL
         * Telefone
         * exiba os dados na tela
         * 
         */
 //    instância do objeto leia
        Scanner leia = new Scanner(System.in);
          
        // declaração de variáveis
        String nome;
        String datadenascimento;
        String cpf;
        String email;
        String telefone; 

         //entrada de dados  

        System.out.println( "Informe seu nome: ");
        nome = leia.nextLine();
        
        System.out.println("Informe sua Data de Nascimento: ");
        datadenascimento = leia.nextLine(); 

        System.out.println("Informe seu CPF: ");
        cpf = leia.nextLine();

        System.out.println("Informe seu Telefone: ");
        telefone = leia.nextLine();

        
        System.out.println( "Informe seu e-mail: ");
        email = leia.nextLine();
        
        


        //saida de dados 

        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua Data de Nascimeno é: " + datadenascimento );
        System.out.println("Seu CPF é: " + cpf);
        System.out.println("Seu e-mail é: " + email);
        System.out.println("Seu Telefone é: " + telefone);
       
       
      

        //fecha objeto close
        leia.close();


    }
}
