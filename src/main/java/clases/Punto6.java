package clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Punto6 {
    public static char findNaughtyStep(String original, String troll) {
        String chars = original + troll;
        List<Character> charList = new ArrayList<>();
        for (char letra : chars.toCharArray()) {
            charList.add(letra);
        }

        return charList.stream()
                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(' ');
    }
}
