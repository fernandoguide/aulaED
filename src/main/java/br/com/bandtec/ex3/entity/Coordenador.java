package br.com.bandtec.ex3.entity;

public class Coordenador implements Bonus {

    private Integer quantidadeHorasCoordenacao;
    private Double valorHoraCoordenacao;

    public Coordenador(String nome, Integer quantidadeAulasSemana, Double valorHoraAula, Integer quantidadeHorasCoordenacao, Double valorHoraCoordenacao) {
        this.quantidadeHorasCoordenacao = quantidadeHorasCoordenacao;
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public Double getValorBonus() {
        return quantidadeHorasCoordenacao * valorHoraCoordenacao * 4.5 * 0.2;
    }

    public Integer getQuantidadeHorasCoordenacao() {
        return quantidadeHorasCoordenacao;
    }

    public void setQuantidadeHorasCoordenacao(Integer quantidadeHorasCoordenacao) {
        this.quantidadeHorasCoordenacao = quantidadeHorasCoordenacao;
    }

    public Double getValorHoraCoordenacao() {
        return valorHoraCoordenacao;
    }

    public void setValorHoraCoordenacao(Double valorHoraCoordenacao) {
        this.valorHoraCoordenacao = valorHoraCoordenacao;
    }

    @Override
    public String toString() {
        return "Coordenador{" +
                "quantidadeHorasCoordenacao=" + quantidadeHorasCoordenacao +
                ", valorHoraCoordenacao=" + valorHoraCoordenacao +
                "} ";
    }
}
