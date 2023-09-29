package exercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio014 {

    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPrimos =   numeros.stream()
               .filter(Desafio014::isPrimo)
                       .collect(Collectors.toList());

        Collections.sort(numerosPrimos, Collections.reverseOrder());


        if (numerosPrimos.size() >= 2){
            System.out.println("O segundo maior numero primo é: " + numerosPrimos.get(1));
        }   else {
            System.out.println("Nao existe um segundo numero primo na lista");
        }


    }
    public static boolean isPrimo (int n) {
        n = Math.abs(n);
        if (n <=1){
            return false;
        }
        for (int i = 2; i* i <=n; i++){

            if (n % i ==0){
                return false;
            }
        }
        return true;
    }
}
