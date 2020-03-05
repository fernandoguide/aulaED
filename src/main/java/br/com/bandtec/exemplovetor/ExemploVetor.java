package br.com.bandtec.exemplovetor;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploVetor {

    public static void main(String[] args) {

        int[] vet = new int[5];
        int[] vet2 = {100, 200, 300, 400};
        int tamanho = 0;
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);

        exibeVetor(vet, sc);
        System.out.println(Arrays.toString(vet2));
        exibirVetor(vet);
        exibirVetor(vet2);
        exibirReversoVetor(vet);

        do {
            System.out.println("Digite o tamanho do vetor: ");
            tamanho = sc.nextInt();
        } while (tamanho <= 0);

        exibirPalavrasVetor(tamanho, leitor);
        somaValoresVetor(vet, soma);
        exibirMesesVetor(sc);

    }

    private static void exibeVetor(int[] vet, Scanner sc) {
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um num");
            vet[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(vet));
    }

    private static void exibirMesesVetor(Scanner sc) {
        int tamanho;
        String[] vetMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        int mesSelecionado = 0;
        while (!(mesSelecionado >= 1 && mesSelecionado <= 12)) {
            System.out.println("Digite um numero de 1 a 12");
            mesSelecionado = sc.nextInt();
        }
        System.out.println(vetMeses[mesSelecionado - 1]);
    }

    private static void exibirPalavrasVetor(int tamanho, Scanner leitor) {
        String[] vet3 = new String[tamanho];
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um nome: ");
            vet3[i] = leitor.next();
        }
        for (String nome : vet3) {
//            System.out.println(nome);
            System.out.print("Palavras dentro do vetor vet3=" + nome + "\t");
        }
        System.out.println();
    }

    public static void exibirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("vetor posição[" + i + "] valor=" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void exibirReversoVetor(int[] v) {
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print("vetor reverso posição[" + i + "] valor=" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void somaValoresVetor(int[] v, int soma) {

        int contaPar = 0;
        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }
//        for (int valor : v) {
//            soma += valor;
//        }
        System.out.println("Total do vetor vet = " + soma);

        for (int valor : v) {
            if (valor % 2 == 0) {
                contaPar++;
            }
        }
        System.out.println("No vetor vet, existem " + contaPar + " numeros pares");
    }

}
