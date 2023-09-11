import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o Numero valor");
        Integer numero = scanner.nextInt();
        Integer soma;



        if (numero % 2 == 0) {
            soma = numero + 5 ;
            System.out.println("O numero é par, entao soma-se mais 5 " + soma);
        } else {
            soma = numero + 8;
            System.out.println("O numero é impar, entao soma-se mais 8 " + soma);
        }
    }
}
