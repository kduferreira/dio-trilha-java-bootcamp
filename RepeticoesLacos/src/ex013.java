import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
// Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
//100.
        Scanner scanner = new Scanner(System.in);
        int intervalo = 0;
        System.out.println("-----------------------------");



        for (int x = 0; x < 10; x++) {

            System.out.println("Digite o numero " + (x + 1) + ": ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            if (numero <= 100){
                intervalo++;
            }
        }
        System.out.println("Os numeros em um intervalo de 0 a 100 são: " + intervalo);
    }
}
