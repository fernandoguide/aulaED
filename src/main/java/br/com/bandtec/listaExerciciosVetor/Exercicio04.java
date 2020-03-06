package br.com.bandtec.listaExerciciosVetor;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[10];
        int num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextInt();
        }
        System.out.println("Verifique o numero: ");
        num = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (num != vet[i]) {
                System.out.println("Nao foi digitado nenhuma vez.");
            } else {
                System.out.println("O numero " + num + " ocore " + vet[i] + " vezes.");
            }
        }
    }
}
