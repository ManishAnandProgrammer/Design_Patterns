package com.manish.chain_of_responsibility;

public class InvalidDispenser implements DispenseChain {

    @Override
    public void setNextChain(DispenseChain chain) {
        throw new RuntimeException("Not Allowed.!");
    }

    @Override
    public void dispense(Currency currency) {
        throw new RuntimeException("Not Allowed.!");
    }
}
