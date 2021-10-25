package com.manish.chain_of_responsibility;

public class Atm {

    private final DispenseChain dispenseChain;

    public Atm() {
        this.dispenseChain = new DollarFiftyDispenser();
        DispenseChain dollar_20_dispenser = new DollarTwentyDispenser();
        DispenseChain dollar_10_dispenser = new DollarTenDispenser();

        dispenseChain.setNextChain(dollar_20_dispenser);
        dollar_20_dispenser.setNextChain(dollar_10_dispenser);
        dollar_10_dispenser.setNextChain(new InvalidDispenser());
    }

    public void findDispense(int amount) {
        if(amount % 10 == 0) {
            dispenseChain.dispense(new Currency(amount));
            return;
        }
        throw new RuntimeException("Please enter amount in multiple of 10");
    }
}
