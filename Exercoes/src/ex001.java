import java.util.InputMismatchException;
import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {


        try {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite o segundo numero: ");
        int numero1 = scanner.nextInt();
        scanner.nextLine();

        int divisao;

        divisao = numero/ numero1;
        System.out.println("A divisao é " + divisao);

        }catch (ArithmeticException e) {
            System.err.println("Erro " + e.getMessage());
        }catch (InputMismatchException e) {
            System.err.println("Erro: Valor informado não é numérico.");
        }
    }
}
