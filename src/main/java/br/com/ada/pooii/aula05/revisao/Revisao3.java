package br.com.ada.pooii.aula05.revisao;

public class Revisao3 {
    public static void main(String[] args) {
        String nome = "Jorge";
        imprimirClasse(String.class);
    }

    public static <T> void imprimirClasse(Class<T> classe) {
        System.out.println(classe);
    }
}

interface InterfaceGenerica <T> {
    T get();
}

interface M {}
interface N extends M {}

class O {
    public <T> void imprimir(T coisa) {
        System.out.println(coisa);
    }
}

// Interface bounded with class and interface
interface InterfaceGenericaLimitada <T extends O & M> {
    T get();
}
