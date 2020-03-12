package br.com.bandtec.listaExerciciosVetor;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] t1 = new String[10];
        String[] t2 = new String[10];
        int indice1 = 0, indice2 = 0;
        String aluno, turma;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o nome do aluno: ");
            aluno = sc.nextLine();
            System.out.println("Digite a turma  do aluno T1 ou T2: ");
            turma = sc.nextLine();
            if (turma.equals("T1")) {
                t1[indice1++] = aluno;
            } else {
                t2[indice2++] = aluno;
            }
        }
        System.out.println("Quantidade de alunos da T1: " + indice1);
        System.out.println("Quantidade de alunos da T2: " + indice2);
        for (int i = 0; i < indice1; i++) {
            System.out.print(t1[i]+"\t");
        }
        for (int i = 0; i < indice2; i++) {
            System.out.print(t2[i]+"\t");
        }


    }
}
