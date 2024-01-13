package br.com.ada.pooii.aula03;

import java.util.ArrayList;
import java.util.List;

public class Generics {
    public static void main(String[] args) {

        Gato gato = new Gato();
        gato.nome = "jay-z";
        gato.cor = "azul";

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "jiló";
        cachorro.raca = "vira-lata";

        List<Animal> animais = new ArrayList<>();
        animais.add(gato);
        animais.add(cachorro);

        imprimirNomeDosAnimais(animais);

    }

    public static void imprimirNomeDosAnimais(List<Animal> animais) {
        for (int i = 0; i < animais.size(); i++) {
            Animal animal = animais.get(i);
            System.out.println(animal.nome);
        }
    }

}
