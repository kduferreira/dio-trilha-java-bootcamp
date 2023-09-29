package exercicios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio06 {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);



        boolean numerosAtdez = numeros.stream()
                .anyMatch(numero -> numero > 10);

        if (numerosAtdez){
            System.out.println("Alista contem numeros maiores que dez ");
        }else {
            System.out.println("A lista nao contem numeros maiores que dez");
        }




        }
    }

