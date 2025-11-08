package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;

public class App {
    public static void main(String[] args) throws Exception {
        //instancia objeto de entrada de dados
        Scanner leia = new Scanner(System.in);

       //instancia as classes
       Carro carro = new Carro();
       Moto moto = new Moto();

       //declaração de variáveis
       String combustível;

       //entrada de dados
       System.out.println("INFORME OS DADOS DO CARRO:\n");
       System.out.println("Informe o fabricante:");
       carro.fabricante = leia.nextLine();
       System.out.println("Informe o modelo:");
       carro.modelo = leia.nextLine();
       System.out.println("Informe a cor:");
       carro.cor = leia.nextLine();
       System.out.println("Informe o ano:");
       carro.ano = leia.nextLine();
       System.out.println("Informe a placa:");
       carro.placa = leia.nextLine();

       //padrão de combustível
       carro.motorFlex = false;
       carro.motorEletrico = false;
       carro.motorDiesel = false;
       carro.motorGasolina = false;
       carro.motorEtanol = false;

       //usuário informa o tipo de combustível
       System.out.println("\nInforme o tipo de combustível:\n");
       System.out.println("1- Gasolina ");
       System.out.println("2- Etanol");
       System.out.println("3- Tanto Gasolina como Etanol");
       System.out.println("4- Diesel");
       System.out.println("5- Elétrico");
       combustível = leia.nextLine();

       switch (combustível) {
        case "1": 
            carro.motorGasolina = true;           
            break;
        case "2": 
            carro.motorEtanol = true;           
            break;    
        case "3": 
            carro.motorFlex = true;    
            break;
         case "4":  
         carro.motorDiesel = true;   
            break;
        case "5":  
        carro.motorFlex = true;   
            break;
        default:
            System.out.println("Motor Inexistente.");
       }
       //entrada de dados da moto
       
       System.out.println("INFORME OS DADOS DO MOTO:\n");
       System.out.println("Informe o fabricante:");
       moto.fabricante = leia.nextLine();
       System.out.println("Informe o modelo:");
       moto.modelo = leia.nextLine();
       System.out.println("Informe a cor:");
       moto.cor = leia.nextLine();
       System.out.println("Informe o ano:");
       moto.ano = leia.nextLine();
       System.out.println("Informe a placa:");
       moto.placa = leia.nextLine();

       //saída de dados
       System.out.println("\n DADOS DO CARRO:\n");
       carro.exibirDados();

       System.out.println("\n DADOS DA MOTO:\n");
       moto.exibirDados();

       //fecha objeto Leia
       leia.close();
       
    }
}
