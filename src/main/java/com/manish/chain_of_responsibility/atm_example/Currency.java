package com.manish.chain_of_responsibility.atm_example;

public class Currency {
    private final int value;

    public Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
