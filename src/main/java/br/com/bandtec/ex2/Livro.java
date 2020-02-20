package br.com.bandtec.ex2;

public class Livro extends  Produto {


    private String nome;
    private String autor;
    private String isbn;

    public Livro(int codigo, double precoCusto, String nome,
                 String autor, String isbn) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }



    @Override
    public double getValorVenda() {
        return getPrecoCusto()*0.10;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", Valor Venda Livro= "+getValorVenda()+
                '}';
    }
}
