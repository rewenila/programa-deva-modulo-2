package br.com.ada.pooii.aula06.exercicio2.before;

import java.math.BigDecimal;
import java.time.LocalTime;

public class TransactionManager {

    private static final BigDecimal MAX_DAILY_LIMIT = new BigDecimal("1000");
    private static final BigDecimal MIN_TRANSACION_VALUE = new BigDecimal("10");

    void executeTrade(Transaction transaction) {

        // add new rule to validate min value per transaction -> one more if block
        // verify if stock id available for trading -> one more if block
        // Todo: modify code to attend open closed principle

        if (transaction.getAmount().compareTo(MAX_DAILY_LIMIT) > 0) {
            throw new RuntimeException("Invalid transaction: amount exceeded maximum daily limit");
        }

        if (transaction.getAmount().compareTo(MIN_TRANSACION_VALUE) < 0) {
            throw new RuntimeException("Invalid transaction: amount is below minimum value per transaction");
        }

        if (isOutsideWorkingHours(transaction)) {
            throw new RuntimeException("Invalid transaction: outside of working hours");
        }

        transact(transaction);

    }

    private void transact(Transaction transaction) {
        System.out.println("Transaction succeeded: " + transaction);
    }

    private boolean isOutsideWorkingHours(Transaction transaction) {

        LocalTime startWorkingHours = LocalTime.of(6,0,0);
        LocalTime endWorkingHours = LocalTime.of(22,0,0);

        LocalTime timeCreated = transaction.getCreated().toLocalTime();

        return timeCreated.isBefore(startWorkingHours) || timeCreated.isAfter(endWorkingHours);
    }
}
