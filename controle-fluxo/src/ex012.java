import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o preço normal de etiqueta do produto: ");
            double precoEtiqueta = scanner.nextDouble();

            System.out.println("Escolha a condição de pagamento (1 a 4): ");
            int codigoCondicao = scanner.nextInt();

            double valorFinal = 0.0;

            switch (codigoCondicao) {
                case 1:
                    // À vista em dinheiro ou cheque, 10% de desconto
                    valorFinal = precoEtiqueta - (precoEtiqueta * 0.10);
                    break;
                case 2:
                    // À vista no cartão de crédito, 15% de desconto
                    valorFinal = precoEtiqueta - (precoEtiqueta * 0.15);
                    break;
                case 3:
                    // Em duas vezes, preço normal de etiqueta sem juros
                    valorFinal = precoEtiqueta / 2;
                    break;
                case 4:
                    // Em duas vezes, preço normal de etiqueta mais juros de 10%
                    valorFinal = (precoEtiqueta / 2) * 1.10;
                    break;
                default:
                    System.out.println("Opção de pagamento inválida.");
                    return; // Encerra o programa se a opção for inválida
            }

            System.out.println("O valor a ser pago é: " + valorFinal);
        }
}
