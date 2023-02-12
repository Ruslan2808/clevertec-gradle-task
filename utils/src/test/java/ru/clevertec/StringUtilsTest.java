package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void givenStringWithPositiveNumber_whenIsPositiveNumber_thenReturnTrue() {
        assertTrue(StringUtils.isPositiveNumber("10"));
    }

    @Test
    void givenStringWithNegativeNumber_whenIsPositiveNumber_thenReturnFalse() {
        assertFalse(StringUtils.isPositiveNumber("-10"));
    }

    @Test
    void givenStringWithZero_whenIsPositiveNumber_thenReturnFalse() {
        assertFalse(StringUtils.isPositiveNumber("0"));
    }

    @Test
    void givenStringNotWithNumber_whenIsPositiveNumber_thenReturnFalse() {
        assertFalse(StringUtils.isPositiveNumber("not a number"));
    }

}