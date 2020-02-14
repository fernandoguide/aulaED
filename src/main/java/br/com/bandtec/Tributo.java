package br.com.bandtec;

import java.util.ArrayList;

public class Tributo {

    private ArrayList<Tributavel> listTributo;

    public Tributo() {
        listTributo = new ArrayList<Tributavel>();
    }

    public void adcionaTrbutavel(Tributavel t) {
        listTributo.add(t);
    }

    public Double calculaTotalTributo() {
        Double total = 0.0;
        for (Tributavel t : listTributo){
            total += t.getValorTributo();
        }
        return total;
    }
}
