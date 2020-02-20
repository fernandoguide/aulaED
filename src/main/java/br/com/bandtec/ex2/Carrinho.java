package br.com.bandtec.ex2;

import br.com.bandtec.ex1.Tributavel;

import java.util.ArrayList;

public class Carrinho {

    ArrayList<Vendavel> listCarrinho;

    public Carrinho() {
        listCarrinho = new ArrayList<Vendavel>();
    }

    public void adicionarCarrinho(Vendavel v){
        listCarrinho.add(v);
    }

    public double calculaTotalVenda(){
        double total = 0.0;
        for (Vendavel v : listCarrinho){
            total += v.getValorVenda();
        }
        return total;
    }

    public void exibeItensCarrinho(){
        for (Vendavel v : listCarrinho){
            System.out.println(v);
        }
    }

}
