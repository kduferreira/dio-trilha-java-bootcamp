package exercicios;

import java.util.*;

public class Desafio019 {


    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


      int numerosParaSomar =  numeros.stream()
                .filter(n -> n %3 ==0 || n %5 ==0)
                .mapToInt(Integer::intValue)
              .sum();


        System.out.println("A soma dos numeros divisiveis por 3 e 5 sao " + numerosParaSomar);


    }
}
