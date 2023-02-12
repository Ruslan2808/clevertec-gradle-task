package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void givenAllStringsWithPositiveNumber_whenIsAllPositiveNumber_thenReturnTrue() {
        assertTrue(Utils.isAllPositiveNumbers("10", "10.10"));
    }

    @Test
    void givenSomeStringsWithNonPositiveNumber_whenIsAllPositiveNumber_thenReturnFalse() {
        assertFalse(Utils.isAllPositiveNumbers("10", "0", "not a number"));
    }

}