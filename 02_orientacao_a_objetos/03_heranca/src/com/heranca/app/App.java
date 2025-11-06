package com.heranca.app;

import com.heranca.models.Pessoa;
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();
        

        usuario.nome = "Luciano Lins";
        usuario.cpf = "123.456.789.01";
        usuario.email = "lulinsdf@gmail.com";
        usuario.telefone = "(61)98145-7600";
        usuario.idade = 50;

        empresa.razaoSocial = "Luciano ltda";
        empresa.nomeFantasia = "Java Solutions";
        empresa.cnpj = "12.123.456/0001-00";
        empresa.email = "javasolutions@gmail.com";
        empresa.telefone = "0800-123456";

        System.out.println("Nome do usuário: " + usuario.nome);
        System.out.println("CPF do usuário: " + usuario.cpf);
        System.out.println("E-mail do usuário: " + usuario.email);
        System.out.println("Telefone do usuário: " + usuario.telefone);
        System.out.println("Idade do usuário: " + usuario.idade + " anos. ");

        
        System.out.println("\n--------------\n");


        System.out.println("Razão Social da empresa: " + empresa.razaoSocial);
        System.out.println("Nome da Empresa: " + empresa.nomeFantasia);
        System.out.println("CNPJ da Empresa: " + empresa.cnpj);
        System.out.println("E-mail da empresa: " + empresa.email);
        System.out.println("Telefone da empresa: " + empresa.telefone);
       
        
    }
}
