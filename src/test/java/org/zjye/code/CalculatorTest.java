package org.zjye.code;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void should_add_and_return() {
        // arrange
        // act
        // assert
        assertEquals(2, new Calculator().add(1,1));
    }
}