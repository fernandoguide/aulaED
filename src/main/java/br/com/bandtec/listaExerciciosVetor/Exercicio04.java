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

        for (int numero : vet) {
            if (numero == num) {
                System.out.println("");
            }

        }
    }
}
