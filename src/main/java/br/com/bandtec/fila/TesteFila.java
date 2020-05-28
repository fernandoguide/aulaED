package br.com.bandtec.fila;

public class TesteFila {
    public static void main(String[] args) {

        Fila fila = new Fila(5);

        fila.insert("1");
        fila.insert("2");
        fila.insert("3");
        fila.insert("4");

        fila.exibe();

        System.out.println("Removeu: " + fila.poll());
        System.out.println();

        fila.exibe();
        System.out.println();

        System.out.println("Topo da Fila: " +fila.peek());
        System.out.println();

        fila.exibe();
        System.out.println();

        while (!fila.isEmpty()) {
            System.out.println("Desempilhando: " + fila.poll());
        }
        fila.exibe();
        System.out.println();


        FilaCircular filaCircular = new FilaCircular(5);
        filaCircular.insert("a");
        filaCircular.insert("b");
        filaCircular.insert("c");
        filaCircular.insert("d");

        filaCircular.exibir();

        System.out.println("Removeu: " + filaCircular.poll());
        System.out.println();

        filaCircular.exibir();
        System.out.println();

        System.out.println("Topo da Fila: " +filaCircular.peek());
        System.out.println();

        while (!filaCircular.isEmpty()) {
            System.out.println("Removendo: " + filaCircular.poll());
        }
        System.out.println("Fim!");
    }
}
