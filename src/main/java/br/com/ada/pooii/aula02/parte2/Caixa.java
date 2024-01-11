package br.com.ada.pooii.aula02.parte2;

public class Caixa <T>{

    /**
     *
     */
    private T obj;

    public Caixa(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public String imprimir() {
        return this.obj.toString();
    }
}
