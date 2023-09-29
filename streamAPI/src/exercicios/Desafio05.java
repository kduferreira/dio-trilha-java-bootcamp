package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio05 {


    public static void main(String[] args) {


    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);



    int numerosMaiorQueFive = numeros.stream()
            .filter(numero -> numero > 5)
            .mapToInt(Integer::intValue)
            .sum();


        System.out.println(numerosMaiorQueFive);
}
}