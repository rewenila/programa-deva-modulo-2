package br.com.ada.pooii.aula02.exercicio1;

public class Main {
    public static void main(String[] args) {

        VeiculoMotorizado carro = new Carro();
        VeiculoMotorizado moto = new Moto();
        Veiculo bicicleta = new Bicicleta();

        // TODO: terminar isso
        carro.ligar();
        carro.acelerar(80);
        carro.acelerar(240);
        carro.frear();
        carro.desligar();

        System.out.println();

        moto.ligar();
        moto.acelerar(80);
        moto.acelerar(200);
        moto.frear();
        moto.desligar();

        System.out.println();

        bicicleta.acelerar(20);
        bicicleta.frear();

    }
}
