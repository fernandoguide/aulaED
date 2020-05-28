package br.com.bandtec.matriz;

import java.util.Scanner;

public class ExemploMatriz {

    public static void main(String[] args) {

        int[][] matriz = new int[3][4];
        String[][] matrizString = new String[3][4];
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
        System.out.println("----------NORMAL----------------");
        exibeMatriz(matriz);
//        System.out.println("-------------------------------");
//        exibeMatriz(matriz1);
//        System.out.println("-------------------------------");
//        exibeMatriz(matrizLoka);
        System.out.println("---------INVERTIDA---------------");
        exibeMatrizInvertida(matriz);


        System.out.println("----------STRING-NORMAL----------------");


        System.out.println("---------STRING-INVERTIDA---------------");


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

        for (int coluna = 0; coluna < m[0].length; coluna++) {
            for (int linha = 0; linha < m.length; linha++) {
                System.out.print(m[linha][coluna] + "\t");
            }
            System.out.println();
        }

    }

    public static void exibeMatrizInvertidaSeForIrreg(int[][] m) {
        int linhaMaisLonga = 1;
        for (int k = 0; k < m.length; k++) {
            if (m[k].length > linhaMaisLonga) {
                linhaMaisLonga = m[k].length;
            }
        }

        for (int coluna = 0; coluna < linhaMaisLonga; coluna++) {
            for (int linha = 0; linha < m.length; linha++) {
                /*System.out.println("::::: posição então é ["+linha+"]["+coluna
                        +"] que é ="+m[linha][coluna]);*/
                try {
                    System.out.print(m[linha][coluna] + "\t");
                } catch (ArrayIndexOutOfBoundsException exception) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

}
