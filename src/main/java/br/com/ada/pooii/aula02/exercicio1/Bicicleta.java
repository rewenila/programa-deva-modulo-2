package br.com.ada.pooii.aula02.exercicio1;

public class Bicicleta implements Veiculo {

    @Override
    public void acelerar(int velocidade) {
        System.out.println("A bicicleta acelerou. Velocidade atual: " + velocidade + " km/h.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta freou.");
    }

}
