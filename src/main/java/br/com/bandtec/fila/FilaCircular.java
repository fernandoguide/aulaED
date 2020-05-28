package br.com.bandtec.fila;

public class FilaCircular {

    private int tamanho;
    private int inicio;
    private int fim;
    private String[] fila;

    public FilaCircular(int capacidade) {
        this.inicio = 0;
        this.fim = 0;
        this.fila = new String[capacidade];
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return (tamanho == fila.length);
    }

    public void insert(String info) {
        if (!isFull()) {
            if (fim == tamanho)
                fim = 0;
            fila[++fim] = info;
            tamanho++;
        } else {
            System.out.println("Fila cheia");
        }
    }

    public String poll() {
        String info = null;
        if (!isEmpty()) {
            if (inicio == tamanho) {
                inicio = 0;
            }
            info = fila[inicio++];
            tamanho --;
            return info;
        }
        return null;
    }

    public String peek() {
        return fila[inicio];
    }

    public void exibir() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            for (int i = 0; i <= fim; i++) {
                System.out.println(fila[i]);
            }
        }
    }

}
