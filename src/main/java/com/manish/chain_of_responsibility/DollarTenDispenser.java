package com.manish.chain_of_responsibility;

public class DollarTenDispenser implements DispenseChain {

    private DispenseChain nextDispenser;

    @Override
    public void setNextChain(DispenseChain nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getValue() >= 10) {
            int amount = currency.getValue();
            int numberOf_10_dollar_notes = amount / 10;
            int remainderAfterDeducting10_dollar_notes = amount % 10;

            System.out.println(numberOf_10_dollar_notes + " number of 10 dollar notes dispensed");
            if(remainderAfterDeducting10_dollar_notes != 0) {
                nextDispenser.dispense(new Currency(remainderAfterDeducting10_dollar_notes));
            }
            return;
        }

        nextDispenser.dispense(currency);
    }
}
