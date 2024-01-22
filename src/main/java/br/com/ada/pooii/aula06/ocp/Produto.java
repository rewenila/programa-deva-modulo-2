package br.com.ada.pooii.aula06.ocp;

public class Produto extends Funcionario {

    public Produto(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.2;
    }
}
