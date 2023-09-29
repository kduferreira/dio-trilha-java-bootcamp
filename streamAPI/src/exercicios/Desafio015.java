package exercicios;
import java.util.*;


public class Desafio015 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3);



        Boolean numerosNegativos = numeros.stream()
                .anyMatch(n -> n < 0);


                if (numerosNegativos){
                    System.out.println("Essa lista contem pelo menos um numero negativo");
                }else {
                    System.out.println("Essa lista nao contem numeros negativos");
                }


    }



}
