package br.com.bandtec.exemplovetor;

import java.util.Arrays;
import java.util.Scanner;

public class ExemploVetor {

    public static void main(String[] args) {

        int[] vet = new int[5];
        int[] vet2 = {100,200,300,400};
        int tamanho =0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite um num");
            vet[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(vet));
        System.out.println(Arrays.toString(vet2));

        exibirVetor(vet);
        exibirVetor(vet2);
        do{
            System.out.println("Digite o tamanho do vetor: ");
            tamanho =sc.nextInt();
        }while (tamanho <=0);
        int[] vet3 = new int[tamanho];

    }
    public  static  void exibirVetor(int[] v){
        for (int i = 0; i < v.length ; i++) {
            System.out.print("vetor posição["+i+"] valor="+v[i] +
                    "\t");
        }
        System.out.println();
    }
}
