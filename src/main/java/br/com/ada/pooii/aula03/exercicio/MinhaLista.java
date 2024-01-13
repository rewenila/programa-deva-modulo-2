package br.com.ada.pooii.aula03.exercicio;

import java.util.ArrayList;
import java.util.List;

public class MinhaLista<T extends ObjetoComId<U>, U> {
    private final List<T> elementos = new ArrayList<>();

    public void adicionar(T elemento) {
        this.elementos.add(elemento);
    }

    public T obter(int indice) {
        if (indice < 0 || indice >= elementos.size()) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        return this.elementos.get(indice);
    }

    public int indice(U id) {
        for (int i = 0; i < this.elementos.size(); i++) {
            T elementoDaPosicao = this.elementos.get(i);
            boolean isIgual = elementoDaPosicao.getId().equals(id);

            if (isIgual) {
                return i;
            }
        }

        return -1;
    }

    public boolean contem(T elemento) {
        return elementos.contains(elemento);
    }

}
