package br.com.ada.pooii.aula06.exercicio2.after;

import java.math.BigDecimal;
import java.time.LocalTime;

public interface TransactionValidator {
    void validate(Transaction transaction);
}

class MaxDailyLimitValidator implements TransactionValidator {

    private final BigDecimal maxDailyLimit;

    public MaxDailyLimitValidator(BigDecimal maxDailyLimit) {
        this.maxDailyLimit = maxDailyLimit;
    }
    @Override
    public void validate(Transaction transaction) {
        if (transaction.getAmount().compareTo(maxDailyLimit) > 0) {
            throw new RuntimeException("Invalid transaction: amount exceeded maximum daily limit");
        }
    }
}

class MinTransactionValueValidator implements TransactionValidator {

    private final BigDecimal minTransactionValue;

    public MinTransactionValueValidator(BigDecimal minTransactionValue) {
        this.minTransactionValue = minTransactionValue;
    }

    @Override
    public void validate(Transaction transaction) {
        if (transaction.getAmount().compareTo(minTransactionValue) < 0) {
            throw new RuntimeException("Invalid transaction: amount is below minimum value per transaction");
        }
    }
}

class WorkingHoursValidator implements TransactionValidator {

    @Override
    public void validate(Transaction transaction) {
        LocalTime startWorkingHours = LocalTime.of(6, 0, 0);
        LocalTime endWorkingHours = LocalTime.of(22, 0, 0);

        LocalTime timeCreated = transaction.getCreated().toLocalTime();

        if (timeCreated.isBefore(startWorkingHours) || timeCreated.isAfter(endWorkingHours)) {
            throw new RuntimeException("Invalid transaction: outside of working hours");
        }
    }
}