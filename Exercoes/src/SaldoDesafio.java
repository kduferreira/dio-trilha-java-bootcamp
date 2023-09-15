import java.util.Scanner;
public class SaldoDesafio {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu saldo total: ");
        int saldoTotal = scanner.nextInt();

        System.out.println("Digite o valor a ser retirado: ");
        int valorSaque = scanner.nextInt();

        if(saldoTotal >= valorSaque){
            saldoTotal -= valorSaque;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldoTotal);
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
    }
}
