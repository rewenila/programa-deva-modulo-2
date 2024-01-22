package br.com.ada.pooii.aula06.revisao;

import br.com.ada.pooii.aula05.exercicio.Stack;
import br.com.ada.pooii.aula05.exercicio.StackImpl;

import java.util.ArrayList;
import java.util.List;

public class Revisao {
    public static void main(String[] args) {

        Stack<Animal> animalStack = new StackImpl<>();

        animalStack.push(new Cachorro());
        animalStack.push(new Gato());
        animalStack.push(new Cavalo());
        animalStack.push(new Potro());

        List<Animal> lista = new ArrayList<>();

        animalStack.transferirObjetos(lista); // method with List<? super E> accepts Cavalo and Potro
        System.out.println(lista);

    }
}

abstract class Animal {

    private String raca;
    private String nome;

    public String getRaca() {
        return this.raca;
    }

    public String getNome() {
        return this.nome;
    }

}

class Gato extends Animal {}

class Cachorro extends Animal {}

class Cavalo extends Animal {}

class Potro extends Cavalo {}