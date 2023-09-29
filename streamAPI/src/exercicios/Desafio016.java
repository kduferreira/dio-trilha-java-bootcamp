package exercicios;
import java.util.*;
import java.util.stream.Collectors;

public class Desafio016 {


    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        Map<Boolean, List<Integer>> numerosSeparado = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n%2 ==0));

        List<Integer> numerosPares = numerosSeparado.get(true);
        List<Integer> numerosImpares = numerosSeparado.get(false);


        System.out.println("Numeros Pares");
        System.out.println(numerosPares);


        System.out.println("Numeros Impares");
        System.out.println(numerosImpares);

    }
}
