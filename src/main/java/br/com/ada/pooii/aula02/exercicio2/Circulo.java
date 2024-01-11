package br.com.ada.pooii.aula02.exercicio2;

public class Circulo implements Shape {

    public double raio;
    public final double PI = 3.14159;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * this.raio * this.raio;
    }
}
