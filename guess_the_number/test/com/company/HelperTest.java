package com.company;

import com.company.Helper;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class HelperTest {
    Helper helper;
    @BeforeEach
    void setUp() {
        helper = new Helper();
    }

    @Test
    void Guess() {
        assertEquals("hi", helper.Guess(19, 7), "Number should return higher than guessed");
    }

    @Test
    void randomNumber() {
    }

    @AfterEach
    void tearDown() {
    }
}