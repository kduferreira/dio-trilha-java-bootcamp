package exercicios;

import java.util.*;
public class Desafio08 {

    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);



        Integer somar =  numeros.stream()
                        .map(String::valueOf)
                                .flatMapToInt(str -> str.chars() )
                                        .map(Character::getNumericValue)
                                                .sum();
        System.out.println(somar);
    }

}
