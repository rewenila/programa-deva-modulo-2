package br.com.ada.pooii.aula01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        // Java itself defines several interfaces in its core libraries, like List
        // ArrayList and LinkedList are implementations of List and share its methods
        List<String> nomes = new ArrayList<>();
        nomes.add("Jorge");
        nomes.add("Maria");
        nomes.add("Eduarda");
        nomes.add("Angela");
        nomes.add("Gustavo");

        // The first one is better because we can change the type of list later without
        // breaking the code
        List<String> a = new LinkedList<>();
        ArrayList<String> b = new ArrayList<>();

        // Collections is a utility class that provides static methods to objects that
        // implement the Collection interface
        Collections.sort(nomes);
        System.out.println(nomes);

        List<Gerente> gerentes = new ArrayList<>();
        Gerente gerente1 = new Gerente("Jorge", 1000);
        Gerente gerente2 = new Gerente("Maria", 2000);
        Gerente gerente3 = new Gerente("Eduarda", 1500);
        Gerente gerente4 = new Gerente("Angela", 3500);
        Gerente gerente5 = new Gerente("Gustavo", 1750);

        gerentes.add(gerente1);
        gerentes.add(gerente2);
        gerentes.add(gerente3);
        gerentes.add(gerente4);
        gerentes.add(gerente5);

        // We implemented the compareTo method for the class Gerente so we could sort here
        // by salary istead of the default
        Collections.sort(gerentes);
        System.out.println(gerentes);
    }
}
