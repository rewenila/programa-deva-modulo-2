package br.com.ada.pooii.aula02.exercicio1;

public class Moto implements VeiculoMotorizado {

    @Override
    public void ligar() {
        System.out.println("Moto ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada.");
    }

    @Override
    public void acelerar(int velocidade) {

        if (velocidade <= getVelocidadeMaximaPermitida()) {
            System.out.println("A moto acelerou. Velocidade atual: " + velocidade + " km/h.");
        } else {
            System.out.println("Velocidade de " + velocidade + " km/h não é permitida para moto.");
        }
    }

    @Override
    public void frear() {
        System.out.println("A moto freou.");
    }

    @Override
    public Integer getVelocidadeMaximaPermitida() {
        return 180;
    }
}
