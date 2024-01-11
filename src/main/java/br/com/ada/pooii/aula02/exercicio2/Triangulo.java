package br.com.ada.pooii.aula02.exercicio2;

public class Triangulo implements Shape{

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (this.base * this.altura) / 2;
    }
}
