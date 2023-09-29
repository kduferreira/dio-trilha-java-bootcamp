package exercicios;

import java.util.*;
public class Desafio011 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);




        Integer somarQuadrados = numeros.stream()
                .mapToInt(n -> n * n)
                .sum();

        System.out.println(somarQuadrados);
    }
}
