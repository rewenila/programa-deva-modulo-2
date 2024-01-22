package br.com.ada.pooii.aula06.exercicio2.after;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TransactionManager {

    private static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal("1000");
    private static final BigDecimal MIN_TRANSACION_VALUE = new BigDecimal("10");

    private List<TransactionValidator> validators;

    public TransactionManager() {
        validators = new ArrayList<>();
        validators.add(new MaxDailyLimitValidator(MAX_DAILY_LIMIT));
        validators.add(new MinTransactionValueValidator(MIN_TRANSACION_VALUE));
        validators.add(new WorkingHoursValidator());
        // If more validators are created, I only need to add them here
    }

    void executeTrade(Transaction transaction) {
        for (TransactionValidator validator : validators) {
            validator.validate(transaction);
        }

        transact(transaction);
    }

    private void transact(Transaction transaction) {
        System.out.println("Transaction succeeded: " + transaction.getStock() + " R$" + transaction.getAmount());
    }
}
