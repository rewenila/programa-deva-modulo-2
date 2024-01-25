package br.com.ada.pooii.aula08.correcao_transaction;

public class EuropeRules2 implements EuropeRuleChecker {

    @Override
    public void check(Transaction transaction) {
        if (!transaction.getStock().startsWith("X"))
            throw new RuntimeException("Rule checker exception: invalid stock.");
    }
}
