package br.com.ada.pooii.aula05.revisao;

public class Revisao2 {

}

interface A {
    default void comer() {
        System.out.println("Comendo da interface A");
    }
}

interface B {
    default void comer() {
        System.out.println("Comendo da interface B");
    }
}

interface C extends A, B {

    // We need to say which one we will use
    @Override
    default void comer() {
        A.super.comer();
        B.super.comer();
    }
}

class D implements C {
    // Does not need to implement because C handled it
}