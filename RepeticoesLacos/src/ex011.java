import java.util.Scanner;

public class ex011 {

    public static void main(String[] args) {

        //Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
        //maiores do que 8.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os numeros abaixo");
        int numerosAcima = 0;

        for (int x = 0; x <20; x++){


            System.out.println("Digite o numero " + (x + 1 ) + ":");
            int numero = scanner.nextInt();
            scanner.nextLine();
            if(numero > 8){
                numerosAcima++;

            }

        }
        System.out.println("existem " + numerosAcima + " Acima de 8");
    }
}
