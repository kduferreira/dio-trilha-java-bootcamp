package exercicios;

import  java.util.*;
import java.util.function.Predicate;

public class Desafio09 {

    public static void main(String[] args) {


    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


   boolean distin = numeros.stream()
           .distinct()
           .count() == numeros.size();

            if (distin){
                System.out.println("Todos os numeros sao distintos");
            }else {
                System.out.println("Existe numeros repetidos");
            }

}
}