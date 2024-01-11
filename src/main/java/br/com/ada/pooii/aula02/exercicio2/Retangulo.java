package br.com.ada.pooii.aula02.exercicio2;

public class Retangulo implements Shape{

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public double calcularArea() {
        return this.altura * this.largura;
    }
}
