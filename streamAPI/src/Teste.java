import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite no numero da conta");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o seu nome");
        String nomeTitular = scanner.nextLine();
        System.out.println("Digite o seu saldo na conta");
        double saldo = scanner.nextDouble();


        Testando t = new Testando(numeroConta,nomeTitular,saldo);



        System.out.println("Informacoes:");
        System.out.println("Conta: " +t.numero);
        System.out.println("Titular: " + t.titular);
        System.out.println("Saldo: R$" + t.saldo);


    }
}

    class Testando {

        int numero;
        String titular;

        Double saldo;


        public Testando(int numero, String titular, Double saldo) {
            this.numero = numero;
            this.titular = titular;
            this.saldo = saldo;
        }


    }

