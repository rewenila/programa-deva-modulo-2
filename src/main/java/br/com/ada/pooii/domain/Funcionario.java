package br.com.ada.pooii.domain;

public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double getBonus();

    public String getNome() {
        return nome;
    }
}
