package br.com.ada.pooii.aula05.exercicio;

import java.util.List;

public interface Stack<E> {
    void  push(E elemento);
    E pop();
    E peek();
    boolean  isEmpty();
    public void transferirObjetos(List<? super E> lista);
    // List<E> lista is flexible only until we define the type
    // accept elements from one class and is parents, is more flexible
}
