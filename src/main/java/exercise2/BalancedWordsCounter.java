package exercise2;

import java.util.HashMap;

public class BalancedWordsCounter {
    public static Integer count(String input) {
        if (input == null) {
            throw new RuntimeException("Input is null");
        }

        Integer counter = input.length();

        for (int startIndex = 0; startIndex < input.length(); startIndex++) {
            char currentCharacter = input.charAt(startIndex);

            if (!Character.isLetter(currentCharacter)) {
                throw new RuntimeException(String.format("Character \"%c\" at index %d is not letter", currentCharacter, startIndex));
            }

            for (int endIndex = startIndex + 2; endIndex <= input.length(); endIndex++) {
                if (isBalanced(input.substring(startIndex, endIndex))) {
                    counter++;
                }
            }
        }

        return counter;
    }

    private static boolean isBalanced(String input) {
        HashMap<Character, Integer> letterOccurrences = getLetterOccurrences(input);
        int firstLetterOccurrences = letterOccurrences.get(input.charAt(0));

        return letterOccurrences.entrySet().stream().allMatch(e -> e.getValue() == firstLetterOccurrences);
    }

    private static HashMap<Character, Integer> getLetterOccurrences(String input) {
        HashMap<Character, Integer> occurrences = new HashMap<>();
        input.chars().forEach((c) -> occurrences.merge((char) c, 1, Integer::sum));

        return occurrences;
    }
}