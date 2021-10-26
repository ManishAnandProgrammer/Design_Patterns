package com.manish.chain_of_responsibility;

import com.manish.chain_of_responsibility.atm_example.Atm;
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
