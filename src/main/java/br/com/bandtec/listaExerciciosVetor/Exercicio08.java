package br.com.bandtec.listaExerciciosVetor;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] t1 = new String[10];
        String[] t2 = new String[10];
        for (int i = 0; i < t1.length; i++) {
            System.out.println("Digite o nome do aluno T1: ");
            t1[i] = sc.nextLine();
        }
        for (int i = 0; i < t2.length; i++) {
            System.out.println("Digite o nome do aluno T2: ");
            t2[i] = sc.nextLine();
        }
        exibirVetor(t1);
        exibirVetor(t2) ;

    }

    public static void exibirVetor(String[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + i + "]valor=" + v[i] + "\t");
        }
        System.out.println();
    }
}
