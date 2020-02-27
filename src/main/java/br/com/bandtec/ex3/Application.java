package br.com.bandtec.ex3;

import br.com.bandtec.ex3.entity.Bonus;
import br.com.bandtec.ex3.entity.Coordenador;
import br.com.bandtec.ex3.entity.Professor;

public class Application {
    public static void main(String[] args) {

    ControleBonus controleBonus = new ControleBonus();

    Bonus funcionario = new Professor("Marcos",3,35.5);
    Bonus funcionario1 = new Coordenador("Thiago",2,40.0,10,35.5);

    controleBonus.adicionarFuncionario(funcionario);
    controleBonus.adicionarFuncionario(funcionario1);

    System.out.println("Lista de Funcionarios: " + controleBonus.listarFuncionarios());

    System.out.println("Quantidade total de bônus: " + controleBonus.calcularTotalBonus());


    }
}
