package br.com.ada.pooii.aula03;

import java.util.ArrayList;
import java.util.List;

public class Casting2 {
    public static void main(String[] args) {

        List<Object> animais = new ArrayList<>();
        Animal animal = new Animal();
        //Gato gato = (Gato) animal; // CLASS CAST EXCEPTION

        Gato gato = new Gato();
        gato.nome = "Mimi";
        gato.cor = "branco";
        animais.add(gato);

        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Toto";
        cachorro.raca = "vira-lata";
        animais.add(cachorro);

        animais.add("abc"); // CLASS CAST EXCEPTION
        //imprimirNomeDosAnimais(animais);

        // IMPLICIT CASTING
        Animal animal1 = gato;

        // BOXING
        // WRAPPERS: Integer, Long, Double, etc.
        // PRIMITIVE TYPES: int, long, double, etc.
        int a = 1;
        Integer aWrapper = a; // not casting, but buxing
        aWrapper.intValue(); // several methods to convert wrappers

        Long c = 2_000_000_000L;
        int i = c.intValue(); // information is lost here

        // UNBOXING
        Integer d = null;
        // int e = d; // null pointer exception when unboxing
        // solution: if to convert only when not null

    }

    public static void imprimirNomeDosAnimais(List animais) {
        for (int i = 0; i < animais.size(); i++) {
            Animal animal; // variable declaration
            Object objetoDaPosicaoI = animais.get(i); // getting element
            animal = (Animal) objetoDaPosicaoI; // casting element
            System.out.println(animal.nome); // printing converted animal
        }
    }

}

class Animal {
    String nome;
}

class Gato extends Animal {
    String cor;
}

class Cachorro extends Animal {
    String raca;
}
