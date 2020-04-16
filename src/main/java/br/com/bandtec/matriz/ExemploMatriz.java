package br.com.bandtec.matriz;

import java.util.Scanner;

public class ExemploMatriz {

    public static void main(String[] args) {

        int[][] matriz = new int[3][4];
        int[][] matriz1 = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int[][] matrizLoka = {{1}, {2, 3, 4, 5, 6}, {7, 8}, {9, 0, 9}};
        Scanner scanner = new Scanner(System.in);
        //loop para preencher os valores da matriz
        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                System.out.println("Digite o valor da matriz [" + linha + "][" + coluna + "]");
                matriz[linha][coluna] = scanner.nextInt();
            }
        }
        exibeMatriz(matriz);
        System.out.println("\nExibe os dados da Matriz 1\n");
        exibeMatriz(matriz1);
        System.out.println("\nExibe os dados da Matriz Loka\n");
        exibeMatriz(matrizLoka);
        System.out.println("\nExibe os dados da Matriz Invertida\n");
        exibeMatrizInvertida(matriz);

    }

    public static void exibeMatriz(int[][] m) {
        // mostrando os dados da matriz
        for (int linha = 0; linha < m.length; linha++) {
            for (int coluna = 0; coluna < m[linha].length; coluna++) {
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
    public static void exibeMatrizInvertida(int[][] m) {
        // mostrando os dados da matriz
        for (int  linha = m.length -1; linha > 0; linha--) {
            for (int coluna = m[linha].length -1; coluna > 0; coluna--) {
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }
    }
}
