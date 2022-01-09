import org.junit.jupiter.api.*;

import java.hangman;

import static org.junit.jupiter.api.Assertions.*;

class hangmanTest {
hangman hmTest;

    @BeforeEach
    void setUp() {
        hmTest = new hangman();
    }

    @Test
    void getRandomNumber() {
        assertNotNull(hmTest.getRandomNumber(), "should return a random number");
        assertTrue(hmTest.getRandomNumber() > 0, "Should not return a value less than 0");
        assertTrue(hmTest.getRandomNumber() < 5, "Should not return a value greater than 4");
    }

    @Test
    void getRandomWord() {
        assertEquals("racing", hmTest.getRandomWord(0), "should return racing");
        assertEquals("mocha", hmTest.getRandomWord(1), "should return mocha");
        assertEquals("optimus", hmTest.getRandomWord(2), "should return optimus");
    }

    @AfterEach
    void tearDown() {
    }
}