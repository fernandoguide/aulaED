package br.com.bandtec;

public class Alimento extends  Produto {

    private  Integer qtdVitamina;

    public Alimento(Integer codigo, String descricao, Double preco, Integer qtdVitamina) {
        super(codigo, descricao, preco);
        this.qtdVitamina = qtdVitamina;
    }


    public Double getValorTributo() {
        return getPreco()*0.15;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "qtdVitamina=" + qtdVitamina +
                ", Tributo= " +getValorTributo() +
                "} " + super.toString();
    }
}
