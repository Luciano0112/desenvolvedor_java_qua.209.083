package com.media.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia da classe Scanner
        Scanner leia = new Scanner(System.in);

        //declaração de variaveis
        String nome;
        double nota;

        //entrada de dados
        System.out.println("Digite o nome do aluno: ");
        nome = leia.nextLine();

        System.out.println("Digite a nota do aluno de 0 a 10: ");
        nota = leia.nextDouble();
        //verifica se a nota é valida
        if (nota >=0 && nota <=10) {
            if (nota >=7){
                System.out.println(nome + " está aprovado.");
            }
            else if(nota >=5) {
                System.out.println(nome + " está de recuperação.");
            }
            else {
                System.out.println(nome + " está reprovado.");
            }
           
        }   
        else {
            System.out.println("Nota invalida! Digite uma nota entre 0 e 10.");
        }

        //fecha objeto Leiador
        leia.close();


    }
}
