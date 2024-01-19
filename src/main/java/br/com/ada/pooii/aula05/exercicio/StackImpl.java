package br.com.ada.pooii.aula05.exercicio;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<E> implements Stack<E> {

    private final List<E> listaInterna;

    public StackImpl() {
        this.listaInterna = new ArrayList<>();
    }
    @Override
    public void push(E elemento) {
        listaInterna.add(elemento);
    }

    @Override
    public E pop() {
        if (!isEmpty())
            return listaInterna.remove(listaInterna.size() - 1);
        return null;
    }

    @Override
    public E peek() {
        if (!isEmpty())
            return listaInterna.get(listaInterna.size() - 1);
        return null;
    }

    @Override
    public boolean isEmpty() {
        /*if (listaInterna.size() == 0) {
            return true;
        } else {
            return false;
        }*/
        return listaInterna.size() == 0;
    }
}
