package br.com.ada.pooii.aula08.correcao_transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private final List<? extends RuleChecker> rules;

    public TransactionManager(List<? extends RuleChecker> rules) {
        this.rules = rules;
    }

    void executeTrade(Transaction transaction) {
        for (RuleChecker rule : rules) {
            rule.check(transaction);
        }

        transact(transaction);
    }

    private void transact(Transaction transaction) {
        System.out.println("Transaction succeeded: " + transaction.getStock() + " R$" + transaction.getAmount());
    }
}
