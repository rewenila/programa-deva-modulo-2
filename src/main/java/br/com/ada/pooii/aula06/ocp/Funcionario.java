package br.com.ada.pooii.aula06.ocp;

abstract class Funcionario {
    private String nome;
    private double salario;
    // private int cargo; // 1 = diretor, 2 = gerente, 3 = marketing, 4 = produto, 5 = almoxarifado

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double calcularBonus();
}
