package br.com.ada.pooii.aula04.generics;

import java.util.Random;

public class Escolhedor {

    private Object[] arrayParaEscolha;

    public Escolhedor(Object[] arrayParaEscolha){
        this.arrayParaEscolha = arrayParaEscolha;
    }

    public Object escolhe() {
        // gets a random number
        Random random = new Random();
        int numeroRandomico = random.nextInt(arrayParaEscolha.length);

        // gets a value from the array
        Object retorno = this.arrayParaEscolha[numeroRandomico];
        return retorno;
    }

}
