package br.com.bandtec.listaExerciciosVetor;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vet3 = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um nome: ");
            vet3[i] = sc.next();
        }
        for (String nome : vet3) {
            System.out.print("Palavras=" + nome + "\t");
        }
        System.out.println();

        System.out.println("Digite um nome para pesquisar: ");
        String nome = sc.next();
        boolean exist = false;
        for (int i = 0; i < vet3.length; i++) {
            if (vet3[i].equals(nome)) {
                System.out.println("Nome encontrado no indice: " + i + "");
                exist = true;
                break;
            }else {
                System.out.println("Nome nao encontrad! ");
            }
        }

    }
}
