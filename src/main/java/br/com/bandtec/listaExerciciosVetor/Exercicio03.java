package br.com.bandtec.listaExerciciosVetor;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int soma = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        for (int valor : vet) {
            soma += valor;
        }
        System.out.println("Total do vetor= " + soma);
        int media = soma / 10;
        System.out.println("Media do vetor= " + media);

    }
}
