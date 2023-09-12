import java.util.Scanner;

public class ex010 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero =scanner.nextInt();
        System.out.println("Tabuada do numero" + numero + " é ");

        for (int x = 0; x < 10; x++){

            int multiplicar;
            multiplicar = numero * x;
            System.out.println("A multiplicação do numero : " + numero + " é " + multiplicar);
        }


    }
}
