import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
        //números.

        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 numeros: ");


        for(int x= 0; x < 10; x++ ) {

            System.out.print("Numero " + (x + 1 ) + ": ");
             int numeros = scanner.nextInt();
             soma = soma + numeros;
        }

        System.out.println("A soma dos Dez numeros é " + soma);
        scanner.close();
    }
}
