package br.com.bandtec.ex2;

public class Servico implements  Vendavel {

    private int codigo;
    private String descricao;
    private int qtdHoras;
    private double valorHora;

    public Servico(int codigo, String descricao, int qtdHoras,
                   double valorHora) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public double getValorVenda() {
        return qtdHoras*valorHora;
    }

    @Override
    public String toString() {
        return "Servico{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", qtdHoras=" + qtdHoras +
                ", valorHora=" + valorHora +
                ", Valor da venda= "+getValorVenda()+
                '}';
    }
}
