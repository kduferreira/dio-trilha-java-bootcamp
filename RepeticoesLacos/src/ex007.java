import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {




        int soma = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 numeros: ");


        for(int x= 0; x < 20; x++ ) {

            System.out.print("Idade da  " + (x + 1 ) + " pessoa : ");
            int idades = scanner.nextInt();
            soma = soma + idades;



        }
            double media = (double) soma / 20;

        System.out.println("A media da idade das vinte pessoas é " + media);
        scanner.close();
    }
}
