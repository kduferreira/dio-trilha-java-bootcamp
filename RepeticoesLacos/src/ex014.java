import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {
      //Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
        //100, quantos estão entre 101 e 200 e quantos são maiores de 200.
        Scanner scanner = new Scanner(System.in);
        int intervalo = 0;
        int intervalo1 = 0;
        int intervalo2 = 0;

               System.out.println("-----------------------------");



        for (int x = 0; x < 10; x++) {

            System.out.println("Digite o numero " + (x + 1) + ": ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            if (numero >= 0 && numero <= 100){
                intervalo++;
            } else if (numero >= 101 && numero <= 200 ) {
                intervalo1++;
            } else if (numero > 200) {
                intervalo2++;

            }
        }
        System.out.println("Os numeros em um intervalo de 0 a 100 são: " + intervalo);
        System.out.println("Os numeros em um intervalo de 101 a 200 são: " + intervalo1);
        System.out.println("Os numeros acima de 200 são: " + intervalo2);
    }
}
