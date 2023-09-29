package exercicios;

import java.util.Arrays;
import java.util.List;

public class Desafio018 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);



     Boolean numerosIguais = numeros.stream()
             .allMatch(n -> n.equals(numeros.get(0)));


     if (numerosIguais){
         System.out.println("Todos os numeros sao iguais");
     }else {
         System.out.println("os  nao sao todos iguais");
     }
    }

}
