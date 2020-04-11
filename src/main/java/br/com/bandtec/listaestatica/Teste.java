package br.com.bandtec.listaestatica;

public class Teste {

    public static void main(String[] args) {
        // Cria objeto da classe ListaEstatica, com tamanho máximo 5
        ListaEstatica lista = new ListaEstatica(5);

        // Adiciona os valores 10, 20, 30
        lista.adiciona(10);
        lista.adiciona(20);
        lista.adiciona(30);
        // Exibe a lista
        lista.exibe();

        // Adiciona os valores 40, 50, 60 (não vai conseguir inserir o 60)
        lista.adiciona(40);
        lista.adiciona(50);
        lista.adiciona(60);
        // Exibe a lista
        lista.exibe();

        // Procura na lista o valor 25
        System.out.println("\nBuscando valor 25...");
        int indRetornado = lista.busca(25);
        if (indRetornado == -1) {
            System.out.println("Valor 25 não encontrado na lista");
        }
        else {
            System.out.println("Valor 25 encontrado no índice " + indRetornado);
        }

        // Procura na lista o valor 30
        System.out.println("\nBuscando valor 30...");
        indRetornado = lista.busca(30);
        if (indRetornado == -1) {
            System.out.println("Valor 30 não encontrado na lista");
        }
        else {
            System.out.println("Valor 30 encontrado no índice " + indRetornado);
        }

        // Remove o valor que está no índice 2 da lista e exibe a lista
        System.out.println("\nRemovendo valor do índice 2...");
        lista.removePeloIndice(2);
        lista.exibe();

        // Remove o valor 20 da lista e exibe a lista
        System.out.println("\nRemovendo valor 20...");
        lista.removeElemento(20);
        lista.exibe();

        // Adiciona o valor 60 e exibe a lista
        System.out.println("\nAdicionando valor 60...");
        lista.adiciona(60);
        lista.exibe();

    }
}
