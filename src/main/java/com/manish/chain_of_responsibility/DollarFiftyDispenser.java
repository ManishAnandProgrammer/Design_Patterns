package com.manish.chain_of_responsibility;

public class DollarFiftyDispenser implements DispenseChain {

    private DispenseChain nextDispenser;

    @Override
    public void setNextChain(DispenseChain nextDispenser) {
        this.nextDispenser = nextDispenser;
    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getValue() >= 50) {
            int amount = currency.getValue();
            int numberOf_50_dollar_notes = amount / 50;
            int remainderAfterDeducting50_dollar_notes = amount % 50;

            System.out.println(numberOf_50_dollar_notes + " number of 50 dollar notes dispensed");
            if(remainderAfterDeducting50_dollar_notes != 0) {
                nextDispenser.dispense(new Currency(remainderAfterDeducting50_dollar_notes));
            }
            return;
        }

        nextDispenser.dispense(currency);
    }
}
