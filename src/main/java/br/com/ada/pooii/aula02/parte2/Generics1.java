package br.com.ada.pooii.aula02.parte2;

public class Generics1 {
    public static void main(String[] args) {

        imprimir(1);
        imprimir("abc");

    }

    public static void imprimir(Object obj) {
        System.out.println(obj);
    }
}
