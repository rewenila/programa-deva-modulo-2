package br.com.ada.pooii.aula08.correcao_transaction;

import java.math.BigDecimal;

public class EuropeRules1 implements EuropeRuleChecker {

    @Override
    public void check(Transaction transaction) {
        if (transaction.getAmount().compareTo(new BigDecimal("300")) < 0)
            throw new RuntimeException("Rule checker exception: min limit for European people.");
    }
}
