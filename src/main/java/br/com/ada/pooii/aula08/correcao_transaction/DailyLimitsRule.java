package br.com.ada.pooii.aula08.correcao_transaction;

import java.math.BigDecimal;

public class DailyLimitsRule implements RuleChecker{

    private static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal("1000");
    private static final BigDecimal MIN_DAILY_LIMIT = new BigDecimal("10");

    @Override
    public void check(Transaction transaction) {
        if (transaction.getAmount().compareTo(MAX_DAILY_LIMIT) > 0) {
            throw new RuntimeException("Invalid transaction: max limit.");
        }

        if (transaction.getAmount().compareTo(MIN_DAILY_LIMIT) < 0) {
            throw new RuntimeException("Invalid transaction: min limit.");
        }
    }

}
