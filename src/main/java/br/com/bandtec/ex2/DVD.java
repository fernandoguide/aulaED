package br.com.bandtec.ex2;

public class DVD extends  Produto {

    private String nome;
    private String gravadora;

    public DVD(int codigo, double precoCusto, String nome,
               String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public double getValorVenda() {
        return getPrecoCusto()*1.20;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "nome='" + nome + '\'' +
                ", gravadora='" + gravadora + '\'' +
                ", Valor venda DVD= "+getValorVenda()+
                '}';
    }
}