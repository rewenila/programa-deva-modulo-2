package br.com.ada.pooii.aula04.generics;

import java.util.List;

public class Utili {

    public static int contarCaracteres(String txt) {
        return txt != null
                ? txt.trim().length()
                : 0;
    }

    public static <T> void swapElementos(List<T> lista, int de, int para) {
        // validations
        // check if de and para are >= 0

        // saving elements temporarily
        T elementoDe = lista.get(de);
        T elementoPara = lista.get(para);

        // swapping elements
        lista.set(de, elementoPara);
        lista.set(para, elementoDe);

    }

    public static <T extends Comparable<T>> T encontrarMaiorElemento(List<T> lista) {
        // recursive type bounded: <T extends Comparable<T>>
        if (lista.isEmpty()) {
            return null;
        }

        T maiorElemento = lista.get(0);

        for (T elemento : lista) {
            if (elemento.compareTo(maiorElemento) > 0) {
                maiorElemento = elemento;
            }
        }

        return maiorElemento;
    }
}
