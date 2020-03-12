package br.com.bandtec.listaExerciciosVetor;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] qtdDiasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril",
                "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro",
                "Novembro", "Dezembro"};

        int diasAcumulados = 0;

        System.out.println("Digite um dia de 1 a 31: ");
        int diaEscolhido = leitor.nextInt();

        System.out.println("Digite um mês de 1 a 12: ");
        int mesEscolhido = leitor.nextInt();

        for (int i = 0; i < mesEscolhido - 1; i++) {
            diasAcumulados += qtdDiasPorMes[i];
        }

        System.out.println("Dia correspondente no ano (" +
                meses[mesEscolhido - 1] + "): " +
                (diasAcumulados + diaEscolhido) + " dias");
    }
}
