package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //instancias
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        //entrada de dados
        System.out.println("Informe o nome:");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o CPF:");
        usuario.cpf = leia.nextLine();
        System.out.println("Infome o e-mail:");
        usuario.email = leia.nextLine();
        System.out.println("Informe a idade:");
        usuario.idade = leia.nextInt();
        System.out.println("Informe a altura em metros:");
        usuario.altura = leia.nextDouble();

        //saídad de dados
        System.out.println("Nome: " + usuario.nome);
        System.out.println("CPF: " + usuario.cpf);
        System.out.println("E-mail: " + usuario.email);
        System.out.println("Idade: " + usuario.idade);    
        System.out.println("Altura: " + usuario.altura + " m");
        
        //fecha objeto leia
        leia.close();
    }
}
