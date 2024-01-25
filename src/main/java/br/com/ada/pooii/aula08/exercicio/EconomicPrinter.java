package br.com.ada.pooii.aula08.exercicio;

public class EconomicPrinter implements Economic{

    @Override
    public void copy(String msg) {
        System.out.println("Copying... " + msg);
    }

    @Override
    public void print(String msg) {
        System.out.println("Printing... " + msg);
    }
}
