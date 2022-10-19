package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertEquals(36, App.loop(5, 6));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "Data.csv", numLinesToSkip = 1)
    public void loop(int n, int m, int rs) {
        assertEquals(rs, App.loop(n, m));
    }
}
