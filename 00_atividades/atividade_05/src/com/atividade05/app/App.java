package com.atividade05.app;

import com.atividade05.models.Pessoa;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();


        //array
        String[] opcoes ={"Informar valores", "Sair do Programa"};
        Object opcao;
        //variáveis
        double imc;
        String resultado;

        do{ 
            //entrada de dados 
            opcao = JOptionPane.showInputDialog(
               null,
               "Selecione uma opção:",
               "Calcular IMC",
               JOptionPane.INFORMATION_MESSAGE,
               null,
               opcoes,
               opcoes[0]
             );

             if (opcao !="Sair do Programa") {
  
                 pessoa.setNome(JOptionPane.showInputDialog("Informe o seu nome"));
                 
                 pessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura").replace(",",".")));
                 
                 pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso").replace(",",".")));
                 
                 
                 //calculo IMC
                 imc = pessoa.getPeso()/(pessoa.getAltura()*pessoa.getAltura()); 

                 //exibe o diagnóstico
                  resultado = (imc <18.5) ? "está abaixo do peso" :
                     (imc <25) ? " está no peso ideal": 
                     (imc <30) ? "está acima do peso":
                     (imc <35) ? "está obeso":
                     (imc < 40)? "está com obsedidade nível 2" :
                     "está com obsedidade mórbida";

                 
                 //saída de dados
                 
                 JOptionPane.showMessageDialog(null,
                    pessoa.getNome() + ", o seu IMC é " + String.format("%.2f", imc) + ".\n Segundo a OMS você " + resultado + "."
                 
                 );
                 
             }
        } while (opcao != "Sair do Programa");

    }
}