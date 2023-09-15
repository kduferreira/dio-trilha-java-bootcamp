import java.util.Scanner;

public class cases {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu saldo atual");
        Double saldoAtual = scanner.nextDouble();
        System.out.println("Digite o seu valor a ser depositado");
        Double valorDeposito = scanner.nextDouble();

        System.out.println("Digite o seu valor a ser sacado");
        Double valorRetirada = scanner.nextDouble();

        saldoAtual -= valorRetirada;
       // saldoAtual = saldoAtual;
        saldoAtual += valorDeposito;
        System.out.println("Saldo atualizado na conta: " + saldoAtual);


    }

}
