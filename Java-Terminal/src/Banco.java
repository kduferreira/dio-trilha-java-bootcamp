import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Please, enter your agency");
        String agency = scanner.next();

        System.out.println("your number");
        Integer number = scanner.nextInt();

        System.out.println("enter your name");
        String clientName = scanner.next();

        System.out.println("enter your balancer");
        Double balance = scanner.nextDouble();

        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.setAgency(agency);
        contaBancaria.setNumber(number);
        contaBancaria.setClientName(clientName);
        contaBancaria.setBalance(balance);

        System.out.println(" Ola " + contaBancaria.getClientName() + ", obrigado por criar uma conta em nosso banco, sua agência é " + contaBancaria.getAgency() + ", conta "
                + contaBancaria.getNumber() + " e seu saldo " + contaBancaria.getBalance() + " já esta disponivel para o saque ");
        //"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

    }
}
