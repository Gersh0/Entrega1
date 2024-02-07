package clases;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;

public class Punto5 {

    public static Optional<Integer> primerIdRepetido(List<Integer> identificaciones) {
        HashSet<Integer> numerosVistos = new HashSet<>();

        return identificaciones.stream()
                .filter(n -> !numerosVistos.add(n)) // Filtrar los números que ya han sido vistos
                .findFirst(); // Encontrar la primera ocurrencia repetida
    }
}
