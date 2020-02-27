package br.com.bandtec.ex3.entity;

public class Professor implements Bonus {

    private Integer quantidadeAulasSemana;
    private Double valorHoraAula;

    public Professor(String nome, Integer quantidadeAulasSemana, Double valorHoraAula) {

        this.quantidadeAulasSemana = quantidadeAulasSemana;
        this.valorHoraAula = valorHoraAula;
    }


    @Override
    public Double getValorBonus() {
        return (quantidadeAulasSemana*valorHoraAula * 4.5 * 0.15);
    }

    public Integer getQuantidadeAulasSemana() {
        return quantidadeAulasSemana;
    }

    public void setQuantidadeAulasSemana(Integer quantidadeAulasSemana) {
        this.quantidadeAulasSemana = quantidadeAulasSemana;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "quantidadeAulasSemana='" + quantidadeAulasSemana + '\'' +
                ", valorHoraAula=" + valorHoraAula +
                "} ";
    }

}
