package br.com.ada.pooii.aula04.generics;

import java.util.List;
import java.util.Random;

public class EscolhedorGenerico<T> {

    private List<T> array;

/*    @SuppressWarnings("unchecked")
    public EscolhedorGenerico(T[] array) {
        // always prefer lists to arrays
        // always try to eliminate warnings
        this.array = (T[]) new Object[10];
        // new List<T>[] // does not exist
        // new List<String>[] // does not exist
        // new T[] // does not exist
    }*/

    public EscolhedorGenerico(List<T> array) {
        this.array = array;
    }

    public T escolhe() {
        // gets a random number
        Random random = new Random();
        int numeroRandomico = random.nextInt(array.size());

        // gets a value from the array
        T retorno = this.array.get(numeroRandomico);
        return retorno;
    }
}
