package clases;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Punto1 {
    public static int numeroSolo(List<Integer> numeros) {
        return numeros.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new RuntimeException("No hay elementos no repetidos"));
    }
}
