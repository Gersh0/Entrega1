package clases;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Pruebas {

    public static void main(String[] args) {

        cambioPunto(1);

        Integer[] arregloP1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        List<Integer> listaP1 = Arrays.asList(arregloP1);

        int elemNoRepetido = Punto1.numeroSolo(listaP1);
        System.out.println("Elemento no repetido: " + elemNoRepetido);

        cambioPunto(2);

        int N = 10; // Cambia N al número deseado
        List<Integer> primos = Punto2.encontrarPrimos(N);

        System.out.println("Los primeros " + N + " números primos son: ");
        primos.forEach(System.out::println);

        cambioPunto(3);

        System.out.println("No lo logré hacer xd");

        cambioPunto(4);

        System.out.println("No lo logré hacer xd");

        cambioPunto(5);
        List<Integer> identificaciones = List.of(5, 1, 5, 1); // Ejemplo de lista de identificaciones

        Optional<Integer> primerRepetido = Punto5.primerIdRepetido(identificaciones);

        if (primerRepetido.isPresent()) {
            System.out.println("El primer número de identificación repetido es: " + primerRepetido.get());
        } else {
            System.out.println("No se encontraron números de identificación repetidos.");
        }

        cambioPunto(6);

        String original1 = "abcd";
        String modified1 = "abcde";
        System.out.println(Punto6.findNaughtyStep(original1, modified1)); // 'e'

        String original2 = "stepfor";
        String modified2 = "stepor";
        System.out.println(Punto6.findNaughtyStep(original2, modified2)); // 'f'

        String original3 = "abcde";
        String modified3 = "abcde";
        System.out.println(Punto6.findNaughtyStep(original3, modified3)); // ''*/

        cambioPunto(7);

        System.out.println("No lo logré hacer xd");
    }

    public static void cambioPunto(int punto) {
        System.out.println("----------------------Punto " + punto + "----------------------");
    }
}
