package br.com.bandtec;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio do aplicacao");

        Alimento a = new Alimento(1,"Sopa de feijao",12.5,30);
        Perfume p = new Perfume(2,"Malbec",400.0,"Amadeirado");
        Servico s = new Servico("Barato",40.0);

        System.out.println(a);
        System.out.println(p);
        System.out.println(s);

        Tributo t = new Tributo();
        t.adcionaTrbutavel(a);
        t.adcionaTrbutavel(p);
        t.adcionaTrbutavel(s);

        System.out.println("O Total de impostos e "+ t.calculaTotalTributo());

        System.out.println("Fim do aplicacao!");
    }
}
