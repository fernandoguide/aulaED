package br.com.bandtec.listaExerciciosVetor;

public class Exercicio01 {
    public static void main(String[] args) {
        int[] vet = {0, 1, 2, 3, 4, 5};
        exibirVetor(vet);
        exibirReversoVetor(vet);
    }

    public static void exibirVetor(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + i + "]valor=" + v[i] + "\t");
        }
        System.out.println();
    }

    public static void exibirReversoVetor(int[] v) {
        for (int i = v.length - 1; i >= 0; i--) {
            System.out.print("[" + i + "]valor=" + v[i] + "\t");
        }
        System.out.println();
    }
}
