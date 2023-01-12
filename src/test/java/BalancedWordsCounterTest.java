import exercise2.BalancedWordsCounter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BalancedWordsCounterTest {
    @Test
    @DisplayName("Single test successful")
    public void validInput() {
        assertEquals(28, BalancedWordsCounter.count("aabbabcccba"));
    }

    @Test
    public void emptyInput() {
        assertEquals(0, BalancedWordsCounter.count(""));
    }

    @Test
    public void inputWithIllegalCharacter() {
        Exception exception = assertThrows(RuntimeException.class, () -> BalancedWordsCounter.count("abababa1"));

        assertEquals("Character \"1\" at index 7 is not letter", exception.getMessage());
    }

    @Test
    public void nullInput() {
        Exception exception = assertThrows(RuntimeException.class, () -> BalancedWordsCounter.count(null));

        assertEquals("Input is null", exception.getMessage());
    }
}