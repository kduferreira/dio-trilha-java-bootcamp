import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        for (int x = 1; x <=10; x++){
            System.out.println("Seu nome é: " +nome);
        }
    }
}
