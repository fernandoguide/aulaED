package br.com.bandtec.fila;

public class Fila {

    private int tamanho;
    private String[] fila;

    public Fila(int capacidade) {
        tamanho = 0;
        fila = new String[capacidade];
    }
    public boolean isEmpty() {
        return tamanho == 0;
    }
    public boolean isFull() {
        return (tamanho == fila.length - 1);
    }
    public void insert(String info) {
        if (!isFull()) {
            fila[tamanho++] = info;
        } else {
            System.out.println("Fila cheia");
        }
    }
    public String poll() {
        if (!isEmpty()) {
            return fila[--tamanho];
        }
        return fila[0];
    }
    public String peek() {
        return fila[0];
    }
    public void exibe() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = 0; i <= tamanho; i++) {
                System.out.println(fila[i]);
            }
        }
    }
}
