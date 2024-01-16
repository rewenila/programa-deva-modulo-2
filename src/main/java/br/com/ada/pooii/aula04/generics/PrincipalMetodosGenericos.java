package br.com.ada.pooii.aula04.generics;

import jdk.jshell.execution.Util;

import java.util.Arrays;
import java.util.List;

public class PrincipalMetodosGenericos {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3);
        Utili.swapElementos(lista, 1, 2);
        Integer maior = Utili.encontrarMaiorElemento(lista);

        System.out.println(lista);
        System.out.println(maior);

        List<String> nomes = Arrays.asList("maria", "ana", "alice", "bruna");
        Utili.swapElementos(nomes, 0, nomes.size() - 1);
        String primeiroNome = Utili.encontrarMaiorElemento(nomes);

        System.out.println(nomes);
        System.out.println("Primeiro: " + primeiroNome);

        List<Animal> animais = Arrays.asList(
                new Animal("cavalo", 1.4),
                new Animal("cachorro", 0.6),
                new Animal("elefante", 2.05),
                new Animal("girafa", 3.4)
        );

        Animal maiorAnimal = Utili.encontrarMaiorElemento(animais);
        System.out.println("Maior animal: " + maiorAnimal.nome());

    }
}
