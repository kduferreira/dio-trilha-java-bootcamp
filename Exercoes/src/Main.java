import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();

        DecimalFormat df = new DecimalFormat("0.00");
        String numeroFormatado = df.format(valor);
        if (valor > 0) {
            System.out.println("Deposito realizado com sucesso!" +  "Saldo atual é: " + numeroFormatado);
        } else if (valor == 0) {
            System.out.println("Encerrando o programa...");
        } else {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        }
    }
}