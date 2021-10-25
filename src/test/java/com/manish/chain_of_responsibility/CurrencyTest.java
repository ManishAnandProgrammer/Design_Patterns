package com.manish.chain_of_responsibility;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CurrencyTest {

    @ParameterizedTest
    @MethodSource("valuesForCurrency")
    void shouldCreateObjectWithGivenNumber(int value) {
        Currency currency = new Currency(value);

        assertEquals(value, currency.getValue());
    }

    static Stream<Arguments> valuesForCurrency() {
        return Stream.of(
                arguments(1),
                arguments(2),
                arguments(3),
                arguments(55),
                arguments(89),
                arguments(543),
                arguments(98232),
                arguments(672)
        );
    }
}
