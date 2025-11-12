package com.combustivel.app;

import javax.swing.JOptionPane;

import com.combustivel.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel();

        //array
        String[] opcoes ={"Informar valores", "Sair do Programa"};
        Object opcao;

        do{ 
            //entrada de dados 
            opcao = JOptionPane.showInputDialog(
               null,
               "Selecione uma opção:",
               "Combustível",
               0,
               null,
               opcoes,
               opcoes[0]
             );

             if (opcao !="Sair do Programa") {
  
                 combustivel.setGasolina(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da gasolina").replace(",",".")));
                 
                 combustivel.setEtanol(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da etanol").replace(",",".")));
                 
                 //saída de dados
                 
                 JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel());
                 
             }
        } while (opcao != "Sair do Programa");

    }
}
