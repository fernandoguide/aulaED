package br.com.bandtec.recursao;

import static java.lang.System.*;

public class ExemploRecursao {

    public static void main(String[] args) {
        int[] vetor = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        out.println(fatorialRecursivo(5));
        out.println(fatorialRecursivoPrint(15));
        out.println("-------------------");
        exibirVetor(vetor, 0);
        out.println("-------------------");
        exibirVetorReverso(vetor, 0);
    }

    public static int fatorialRecursivo(int n) {
        if (n == 0) {
            return 1;  // 0! = 1
        } else {
            return n * fatorialRecursivo(n - 1); // m! = n * (n-1)!
        }
    }

    public static void exibirVetor(int[] v, int indice) {

        if (indice < v.length) {
            out.println(v[indice]);
            exibirVetor(v, indice + 1);
        }
    }
    public static void exibirVetorReverso(int[] v, int indice) {

        if (indice < v.length) {
            exibirVetorReverso(v, indice + 1);
            out.println(v[indice]);
        }
    }

    public static int fatorialRecursivoPrint(int n) {
        if (n == 0) {
            out.println("0! = 1");
            return 1;  // 0! = 1
        } else {
            int result = n * fatorialRecursivoPrint(n - 1);
            out.println(n + "! = " + result);
            return n * fatorialRecursivo(n - 1); // m! = n * (n-1)!
        }
    }
}
