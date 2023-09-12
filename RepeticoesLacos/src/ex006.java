import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {

// Leia a idade de 20 pessoas e exiba a soma das idades
        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade das vinte pessoas! ");


        for(int x= 0; x < 20; x++ ) {

            System.out.print("idade da  " + (x + 1 ) + " pessoa : ");
            int numeros = scanner.nextInt();
            soma = soma + numeros;
        }

        System.out.println("A soma as vinte idades é " + soma);
        scanner.close();
    }
}
