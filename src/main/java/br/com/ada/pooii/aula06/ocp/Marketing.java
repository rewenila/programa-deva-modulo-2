package br.com.ada.pooii.aula06.ocp;

public class Marketing extends Funcionario {

    public Marketing(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.3;
    }
}
