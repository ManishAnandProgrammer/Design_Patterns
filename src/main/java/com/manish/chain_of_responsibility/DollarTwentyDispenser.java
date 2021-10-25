package com.manish.chain_of_responsibility;

public class DollarTwentyDispenser implements DispenseChain {

    private DispenseChain nextDispenser;

    @Override
    public void setNextChain(DispenseChain nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getValue() >= 20) {
            int amount = currency.getValue();
            int numberOf_20_dollar_notes = amount / 20;
            int remainderAfterDeducting20_dollar_notes = amount % 20;

            System.out.println(numberOf_20_dollar_notes + " number of 20 dollar notes dispensed");
            if(remainderAfterDeducting20_dollar_notes != 0) {
                nextDispenser.dispense(new Currency(remainderAfterDeducting20_dollar_notes));
            }
            return;
        }

        nextDispenser.dispense(currency);
    }
}
