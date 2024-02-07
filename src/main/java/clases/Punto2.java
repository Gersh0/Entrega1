package clases;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Punto2 {

    /*public static List<Integer> encontrarPrimos(int N) {
        boolean[] esPrimo = new boolean[N * 10]; // Usamos un rango mayor para asegurarnos de tener suficientes primos
        List<Integer> primos = new ArrayList<>();

        for (int i = 2; primos.size() < N; i++) {
            if (!esPrimo[i]) {
                primos.add(i);

                // Marcar los múltiplos de i como no primos
                for (int j = i * 2; j < esPrimo.length; j += i) {
                    esPrimo[j] = true;
                }
            }
        }

        return primos;
    }*/

    public static List<Integer> encontrarPrimos(int N) {
        return IntStream.iterate(2, i -> i + 1)
                .filter(Punto3::esPrimo)
                .limit(N)
                .boxed()
                .collect(Collectors.toList());
    }
}
