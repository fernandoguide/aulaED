package br.com.bandtec.ex2;

import java.io.IOException;
import java.util.Scanner;

public class TesteCarrinho {

    public static void main(String[] args) {

        System.out.println("Aplicacao iniciada!");
        int opcao;
        Scanner sc = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        do {
            System.out.println("\n\n");
            System.out.println("\t\t\t\t _______________________");
            System.out.println("\t\t\t\t|                       |");
            System.out.println("\t\t\t\t|    SISTEMA VENDAS     |");
            System.out.println("\t\t\t\t|                       |");
            System.out.println("\t\t\t\t|   Menu de Opçoes:     |");
            System.out.println("\t\t\t\t|                       |");
            System.out.println("\t\t\t\t|1. Adiciona livro      |");
            System.out.println("\t\t\t\t|2. Adiciona DVD        |");
            System.out.println("\t\t\t\t|3. Adiciona Serviço    |");
            System.out.println("\t\t\t\t|4. Lista Itens carrinho|");
            System.out.println("\t\t\t\t|5. Exibe Total Vendas  |");
            System.out.println("\t\t\t\t|6. Encerra o programa  |");
            System.out.println("\t\t\t\t|_______________________|");
            System.out.print("\n\n\nDigite a opção desejada: ");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Voce esta  adicionando um " +
                            "livro");
                    System.out.println("Digite o codigo: ");
                    int codigo = sc.nextInt();
                    System.out.println("Digite o preco: ");
                    double precoCusto = sc.nextDouble();
                    System.out.println("Digite o nome do livro");
                    String nome = sc.next();
                    System.out.println("Digite o nome do autor");
                    String autor = sc.next();
                    System.out.println("Digite o isbn");
                    String isbn = sc.next();
                    Livro lv = new Livro(codigo, precoCusto, nome,
                            autor, isbn);
                    carrinho.adicionarCarrinho(lv);
//                    limparTela();
                    System.out.println("Foi adicionado no carrinho " +
                            "o item " + lv);
                    break;
                case 2:
//                  add dvd
                    System.out.println("Voce esta  adicionando um " +
                            "DVD no carrinho");
                    System.out.println("Digite o codigo: ");
                    int codigoDvd = sc.nextInt();
                    System.out.println("Digite o preco: ");
                    double precoCustoDvd = sc.nextDouble();
                    System.out.println("Digite o nome do DVD");
                    String nomeDVD = sc.next();
                    System.out.println("Digite o nome da Gravadora");
                    String gravadora = sc.next();
                    DVD dvd = new DVD(codigoDvd, precoCustoDvd,
                            nomeDVD, gravadora);
                    carrinho.adicionarCarrinho(dvd);
//                    limparTela();
                    System.out.println("Foi adicionado no carrinho " +
                            "o item " + dvd);
                    break;
                case 3:
//                   add servico
                    System.out.println("Voce esta  adicionando um " +
                            "Serviço no carrinho");
                    System.out.println("Digite o codigo: ");
                    int codigoServico = sc.nextInt();
                    System.out.println("Digite o nome do serviço");
                    String descricao = sc.next();
                    System.out.println("Digite a quantidade de " +
                            "horas: ");
                    int qtdHoras = sc.nextInt();
                    System.out.println("Digite o valor hora: ");
                    double valorHora = sc.nextDouble();
                    Servico s = new Servico(codigoServico, descricao, qtdHoras, valorHora);
                    carrinho.adicionarCarrinho(s);
//                    limparTela();
                    System.out.println("Foi adicionado no carrinho " +
                            "o item " + s);
                    break;
                case 4: // lista itens carrinho
                    carrinho.exibeItensCarrinho();
                    break;
                case 5:
//                    mostra total venda
                    carrinho.exibeItensCarrinho();
                    System.out.println("Valor total da compra = " + carrinho.calculaTotalVenda());
                    break;
                case 6:
                    System.out.println("Sistema será encerrado");
                    break;
                default:
                    System.out.println("Opção inexistente!");
                    break;
            }//fim do switch
//            limparTela();
        } while (opcao != 6);
//        limparTela();
    }
//    public static void limparTela() {
//        try {
//            Runtime.getRuntime().exec("clear");
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
