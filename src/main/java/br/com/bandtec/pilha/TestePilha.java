package br.com.bandtec.pilha;

public class TestePilha {

    public static boolean ehPalindromo(int[] v) {
        // Cria uma pilha p de tamanho igual ao tamanho do vetor v
        Pilha p = new Pilha(v.length);

        // Percorre o vetor v, empilhando todos os valores na pilha p
        for (int i = 0; i < v.length; i++) {
            p.push(v[i]);
        }

        // Percorre novamente o vetor v, comparando cada elemento do vetor v
        // com o valor desempilhado da pilha p
        // Se algum der diferente, é porque não é palíndromo, então retorna false
        for (int i = 0; i < v.length; i++) {
            if (v[i] != p.pop()) {
                return false;
            }
        }

        /*
         * Se percorreu todo o vetor e todos os valores eram iguais aos desempilhados
         * então é o vetor é palíndromo
         */
        return true;
    }

    public static void main(String[] args) {


        /* Cria objeto pilha, com capacidade 5 */
        Pilha pilha = new Pilha(5);

        /* Empilha valores */
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);
        pilha.push(50);
        pilha.push(60);

        /* Exibe a pilha */
        pilha.exibe();

        /* Desempilha e exibe um valor */
        System.out.println("Desempilhou: " + pilha.pop());
        System.out.println();

        /* Exibe a pilha novamente */
        pilha.exibe();
        System.out.println();

        /* Exibe o elemento do topo da pilha, sem desempilhar */
        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println();

        /* Exibe a pilha novamente */
        pilha.exibe();
        System.out.println();

        /*
         * Enquanto a pilha não estiver vazia, desempilha e exibe um valor da pilha
         */
        while (!pilha.isEmpty()) {
            System.out.println("Desempilhando: " + pilha.pop());
        }

        int[] v1 = {1, 3, 3, 1};
        int[] v2 = {10, 20, 30, 40};
        int[] v3 = {1, 2, 3, 2, 1};

        if (ehPalindromo(v1)) {
            System.out.println("v1 é palíndromo");
        } else {
            System.out.println("v1 não é palíndromo");
        }

        if (ehPalindromo(v2)) {
            System.out.println("v2 é palíndromo");
        } else {
            System.out.println("v2 não é palíndromo");
        }

        if (ehPalindromo(v3)) {
            System.out.println("v3 é palíndromo");
        } else {
            System.out.println("v3 não é palíndromo");
        }
    }
}
