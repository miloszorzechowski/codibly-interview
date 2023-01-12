package exercise1;

import java.util.ArrayList;
import java.util.Objects;

public class BubbleSort {
    public static <T extends Comparable<T>> ArrayList<T> sort(ArrayList<T> input) {
        if (input == null) {
            throw new RuntimeException("Input is null");
        }

        ArrayList<T> sortedInput = new ArrayList<>(input);
        sortedInput.removeIf(Objects::isNull);

        for (int i = 0; i < sortedInput.size() - 1; i++) {
            for (int j = 0; j < sortedInput.size() - i - 1; j++) {
                if (sortedInput.get(j).compareTo(sortedInput.get(j + 1)) > 0) {
                    T temp = sortedInput.get(j);
                    sortedInput.set(j, sortedInput.get(j + 1));
                    sortedInput.set(j + 1, temp);
                }
            }
        }

        return sortedInput;
    }
}