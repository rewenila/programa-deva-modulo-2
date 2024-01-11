package br.com.ada.pooii.aula02.exercicio1;

public class Carro implements VeiculoMotorizado {

    @Override
    public void ligar() {
        System.out.println("Carro ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado.");
    }

    @Override
    public void acelerar(int velocidade) {

        if (velocidade <= getVelocidadeMaximaPermitida()) {
            System.out.println("O carro acelerou. Velocidade atual: " + velocidade + " km/h.");
        } else {
            System.out.println("Velocidade de " + velocidade + " km/h não é permitida para carro.");
        }
    }

    @Override
    public void frear() {
        System.out.println("O carro freou.");
    }

    @Override
    public Integer getVelocidadeMaximaPermitida() {
        return 230;
    }
}
