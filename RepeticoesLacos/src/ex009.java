import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {

        int idadesMaisVelhas = Integer.MAX_VALUE;
        String nomesMaisVelhos = "";
        int maisVelhos = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o os campos abaixo");


        for (int x = 0; x < 20; x++) {


            System.out.print("A idade da " + (x + 1) + " : ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if(idade >= 18) {
                maisVelhos++;
            }


        }
        System.out.println("existem "  + maisVelhos + " Pessoas acima de 18 anos");
    }
}
