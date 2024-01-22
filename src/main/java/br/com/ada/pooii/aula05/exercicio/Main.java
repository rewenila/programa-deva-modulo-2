package br.com.ada.pooii.aula05.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Stack<String> minhaStack = new StackImpl<>();

        // PUSH
        minhaStack.push("Lucia");
        minhaStack.push("Maria");
        minhaStack.push("Erica");
        minhaStack.push("Paula");

        // POP
        String nome = minhaStack.pop();
        System.out.println(nome);

        nome = minhaStack.pop();
        System.out.println(nome);

        // PEEK
        nome = minhaStack.peek();
        System.out.println(nome);

        nome = minhaStack.peek();
        System.out.println(nome);

        // IS EMPTY
        System.out.println("Is empty? " + minhaStack.isEmpty());

        // TRANSFERENCE
        List<String> todosOsElementos = new ArrayList<>();
        minhaStack.transferirObjetos(todosOsElementos);
        System.out.println(todosOsElementos);

    }
}
