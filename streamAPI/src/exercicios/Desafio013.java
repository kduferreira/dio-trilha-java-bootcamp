package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio013 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);




       List<Integer> filter5a10 = numeros.stream()
                .filter(n -> n >= 5 && n <=10)
                .toList();


        filter5a10.forEach(System.out::println);
    }
}
