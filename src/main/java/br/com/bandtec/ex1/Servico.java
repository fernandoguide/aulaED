package br.com.bandtec.ex1;

public class Servico implements Tributavel {

    private String descricao;
    private Double preco;

    public Servico(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }


    public Double getValorTributo() {
        return preco * 0.12;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", Tributo= " + getValorTributo() +
                '}';
    }
}
