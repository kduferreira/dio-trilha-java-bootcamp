package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Desafio02 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        int somar = numeros.stream()
                .filter(numero ->numero % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("A soma dos numeros pares sao : " + somar);
    }
}
