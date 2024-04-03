/*
 * Fazer um programa que colocaremos o ano de nascimento e o ano atual 
 * para calcular a idade em anos, meses, dias e semanas
 */

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
     //declaração das variáveis

     int idadeAnos, anoAtual, anoNasc, idadeMeses, idadeDias, idadeSemanas;

     //atribuir o ano atual e o ano de nascimento 

     anoAtual = 2024;
     anoNasc = 2004;


     //calcular as idades 

     idadeAnos = anoAtual - anoNasc;
     idadeMeses = idadeAnos * 12;
     idadeDias = idadeAnos * 365;
     idadeSemanas = idadeDias / 7; 

     // saída de dados 

     JOptionPane.showMessageDialog(null,
     "\n Idade em anos: " + idadeAnos +
     "\n Idade em meses: " + idadeMeses +
     "\n Idade em semanas: " + idadeSemanas +
     "\n Idade em dias: " + idadeDias);

    }
}

//teste