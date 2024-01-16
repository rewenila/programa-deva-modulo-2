package br.com.ada.pooii.aula04.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        String[] nomes = {"maria", "joana", "laura", "erica"};

        String nome = (String) new Escolhedor(nomes).escolhe();

        System.out.println(nome.toUpperCase());

        // arrays are covariants
        Object[] arrayDeObjetos = new Long[10];
        // arrayDeObjetos[0] = "maria"; // no error while compiling, only runtime error: ArrayStoreException

        // lists are invariants
        // List<Object> listaDeObjetos = new ArrayList<Long>(); // this provide a compile time error

        List<String> nomesList = Arrays.asList("maria", "joana", "laura", "erica");
        String nomeEscolhido = new EscolhedorGenerico<>(nomesList).escolhe();
        System.out.println(nomeEscolhido.toUpperCase());

        // extra: unmodifiable lists
        ArrayList<Object> objects = new ArrayList<>();
        List<String> nomesUnmodifiable = Collections.unmodifiableList(nomesList);
        // nomesUnmodifiable.add("aline"); // error: unmodifiable list
    }
}


