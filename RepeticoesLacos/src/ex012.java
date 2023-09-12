import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        // Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
        //pares

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        int pares = 0;

        for (int x = 0; x < 20; x++){

            System.out.println("Digite o numero " + (x + 1) + ": ");
            int numeros = scanner.nextInt();
            scanner.nextLine();
            if(numeros % 2 == 0) {
                pares++;
            }
        }
        System.out.println("Existem " + pares + " numeros pares");
    }
}
