package testar;

import java.util.*;

public class ex20 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


       numeros.stream()
                .distinct()
                .count();


       numeros.forEach(System.out::println);


    }
}
