package br.com.ada.pooii.aula04.casting;

public class Principal {
    public static void main(String[] args) {

        // Implicit casting: child class to parent class
        Integer inteiro = 123;
        Number numero = inteiro;

        Animal animal = new Gato();
        // animal.raca; // Animal does not have this method, only Gato

        // Explicit casting
        // byte: -120 to 128
        // short: -32_768 to 32_768
        // int: -2_147_483_648 to 2_147_483_648
        // long: a really big number

        short st = 127;
        byte bt = (byte) st;

        System.out.println(bt);

        long longo = 123L;
        int num = (int) longo;

        int dataNascimento = 1980;
        short curto = (short) dataNascimento;

        long idadeFuncioario = 30;
        int idadeInt = (int) idadeFuncioario;

        double salario = 1299.99;
        int salarioInt = (int) salario; // we loose information here
        System.out.println(salarioInt);

        long numeroLongo = 123L;
        double resultado = 22.10 + 5; // implicit casting for number 5
        System.out.println(resultado);

        int resultado2 = (int) 22.10 + 5; // 22.10 to 22 is not implicit, we need to make it explicit and will loose information
        System.out.println(resultado2);
    }
}

class Animal{
    String nome;
}

class Gato extends Animal{
    String raca;
}

