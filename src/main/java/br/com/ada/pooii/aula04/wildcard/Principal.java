package br.com.ada.pooii.aula04.wildcard;

import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        // WILDCARDS: unknown type
        // why they exist?
        // List<Object> is not child of List<Long> even if Long is a child of Object

        List<Number> list1 = Arrays.asList(1, 1.2, 2l);
        imprimirNumerosSemWildcard(list1);

        List<Double> list2 = List.of(1.2, 1.3, 1.4);
        // imprimirNumerosSemWildcard(list2); does not compile
        imprimirNumerosComWildcard(list2);

        double resultado1 = somarListaDeNumeros(list1);
        double resultado2 = somarListaDeNumeros(list2);
        System.out.println(resultado1);
        System.out.println(resultado2);

        List<?> list3 = List.of(1,2,3);
    }

    public static void imprimirNumerosSemWildcard(List<Number> numeros) {
        for (Number n : numeros) System.out.println(n);
    }

    public static void imprimirNumerosComWildcard(List<? extends Number> numeros) {
        // List<? extends Number> is an example of limited wildcard
        for (Number n : numeros) System.out.println(n);
    }

    // lower bpounded wildcard
    public static <T> double somarListaDeNumeros(List<? extends Number> numeros) {
        double resultado = 0.0;

        for (Number n : numeros) {
            resultado += n.doubleValue();
        }

        return resultado;
    }

    // lower bounded wildcard
    public static void addPrimeirosCincoNumeros(List<? super Integer> numeros) {
        for (int i = 0; i < 6; i++) {
            numeros.add(i);
        }
    }

}
