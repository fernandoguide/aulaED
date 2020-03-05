package br.com.bandtec.listaExerciciosVetor;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        double soma = 0.0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        for (int valor : vet) {
            soma += valor;
        }
        System.out.println("Total do vetor= " + soma);
        double media = soma / 10;
        System.out.println("Media do vetor= " + media);
        System.out.println("Maiores que a media:");
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] > media) {
                System.out.print("{" + vet[i]+"}\t");
            }
        }
    }
}
