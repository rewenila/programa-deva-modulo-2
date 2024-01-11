package br.com.ada.pooii.aula02.exercicio2;

public class Main {
    public static void main(String[] args) {

        Shape circulo = new Circulo(10);
        Shape retangulo = new Retangulo(10, 20);
        Shape triangulo = new Triangulo(10, 20);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do triângulo: " + triangulo.calcularArea());

    }
}
