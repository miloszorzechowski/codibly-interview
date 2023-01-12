import exercise1.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BubbleSortTest {
    @Test
    public void validIntegerInput() {
        ArrayList<Integer> actual = new ArrayList<>(Arrays.asList(1, 4, 5, 6, 8, 3, 8));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 6, 8, 8));

        assertEquals(expected, BubbleSort.sort(actual));
    }

    @Test
    public void validDoubleInput() {
        ArrayList<Double> actual = new ArrayList<>(Arrays.asList(-9.3, 0.2, 4.0, 0.1, 5.0, 9.0));
        ArrayList<Double> expected = new ArrayList<>(Arrays.asList(-9.3, 0.1, 0.2, 4.0, 5.0, 9.0));

        assertEquals(expected, BubbleSort.sort(actual));
    }

    @Test
    public void emptyInput() {
        ArrayList<Double> actual = new ArrayList<>();
        ArrayList<Double> expected = new ArrayList<>();

        assertEquals(expected, BubbleSort.sort(actual));
    }

    @Test
    public void validDoubleInputContainsNull() {
        ArrayList<Double> actual = new ArrayList<>(Arrays.asList(null, 5.0001));
        ArrayList<Double> expected = new ArrayList<>(List.of(5.0001));

        assertEquals(expected, BubbleSort.sort(actual));
    }

    @Test
    public void nullInput() {
        Exception exception = assertThrows(RuntimeException.class, () -> BubbleSort.sort(null));

        assertEquals("Input is null", exception.getMessage());
    }
}