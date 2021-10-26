package com.manish.chain_of_responsibility.atm_example;

public interface DispenseChain {
    void setNextChain(DispenseChain chain);
    void dispense(Currency currency);
}
