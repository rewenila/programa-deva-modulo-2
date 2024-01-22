package br.com.ada.pooii.aula06.exercicio2.after;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        TransactionManager manager = new TransactionManager();

        var t1 = new Transaction(new BigDecimal(100), "ADA");
        var t2 = new Transaction(new BigDecimal(9), "ADA");
        var t3 = new Transaction(new BigDecimal(1001), "ADA");

        manager.executeTrade(t1);
        // manager.executeTrade(t2);
        // manager.executeTrade(t3);

    }
}
