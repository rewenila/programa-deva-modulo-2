package br.com.ada.pooii.aula06.exercicio2.before;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        TransactionManager manager = new TransactionManager();

        var t1 = new Transaction(new BigDecimal(100), "ADA");

        manager.executeTrade(t1);

    }
}
