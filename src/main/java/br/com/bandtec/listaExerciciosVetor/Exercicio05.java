package br.com.bandtec.listaExerciciosVetor;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        String[] modelos = new String[5];
        double[] consumos = new double[5];

        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        do {
            System.out.println("Adicione o modelo");
            String modelo = leitor.nextLine();
            modelos[cont] = modelo;
            cont++;
        } while (cont < modelos.length);

        int contC = 0;
        do {
            System.out.println("Adicione o consumo");
            double consumo = leitor.nextDouble();
            consumos[contC] = consumo;
            contC++;
        } while (contC < consumos.length);

        for (int i = 0; i < modelos.length; i++) {
            System.out.print(modelos[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < consumos.length; i++) {
            System.out.print(consumos[i] + "\t");
        }
        System.out.println();
        double maiorConsumo = 0.0;
        int index = 0;
        for (int i = 0; i < modelos.length; i++) {
            if (consumos[i] > maiorConsumo) {
                maiorConsumo = consumos[i];
                index = i;
            }
        }

        System.out.println("Modelo mais econômico: " +
                modelos[index]);

        double menorConsumo = consumos[0];
        int indexMenor = 0;
        for (int i = 1; i < consumos.length; i++) {
            if (consumos[i] < menorConsumo) {
                menorConsumo = consumos[i];
                indexMenor = i;
            }
        }

        System.out.println("Modelo menos econômico: " +
                modelos[indexMenor]);

    }
}
