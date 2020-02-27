package br.com.bandtec.ex3;

import java.util.ArrayList;
import java.util.List;

public class ControleBonus {

    private ArrayList<Bonus> listaFuncionario = new ArrayList<Bonus>();

    public void adicionarFuncionario(Bonus b){
        listaFuncionario.add(b);
    }

    public List<Bonus> listarFuncionarios(){
        return listaFuncionario;
    }

    public Double calcularTotalBonus(){
        //essa é a forma simples de calcular o total de bonus
        Double total = 0.0;
        for (Bonus funcionario : listaFuncionario) {
            total += funcionario.getValorBonus();
        }
        return total;

// essa implementacao é um pouco mais complicada só que eu considero mais curta
//        return listaFuncionario.stream().mapToDouble(Funcionario::getValorBonus).sum();

}
}
