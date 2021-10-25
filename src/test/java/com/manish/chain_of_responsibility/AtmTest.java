package com.manish.chain_of_responsibility;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtmTest {

    @Test
    void whenUserEnterValueWhichIsNotDivisibleByTenThanReturnException() {
        Atm atm = new Atm();
        Assertions.assertThrows(RuntimeException.class, () -> {
            atm.findDispense(112);
        });
    }
}
