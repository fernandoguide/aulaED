package br.com.bandtec.listaExerciciosVetor;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digite um número");
            numeros[i] = leitor.nextInt();
        }
        System.out.println("Agora digite um número qualquer");
        int numeroDigitado = leitor.nextInt();
        int qtdDeOcorrencias = 0;

        for (int numero : numeros) {
            if (numero == numeroDigitado) {
                qtdDeOcorrencias++;
            }
        }
        System.out.println("O número digitado ocorre "
                + qtdDeOcorrencias + " vezes no vetor");

    }
}
