package br.com.ada.pooii.aula08.correcao_transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<RuleChecker> rules = new ArrayList<>();
        rules.add(new DailyLimitsRule());
        rules.add(new AfterWorkingHoursRule(17));

        List<EuropeRuleChecker> europeRules = new ArrayList<>();
        europeRules.add(new EuropeRules1());
        europeRules.add(new EuropeRules2());

        TransactionManager manager = new TransactionManager(rules);

        var t1 = new Transaction(new BigDecimal(100), "ADA");
        var t2 = new Transaction(new BigDecimal(301), "XADA");

        manager.executeTrade(t1);
        manager.executeTrade(t2);

    }
}
