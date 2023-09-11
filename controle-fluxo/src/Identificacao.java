import java.util.Scanner;

public class Identificacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o seu sexo (M/F): ");
        String sexo = scanner.nextLine();
        System.out.print("Digite o seu estado civil: ");
        String civil = scanner.nextLine();

        if(sexo.equalsIgnoreCase("f")  && civil.equalsIgnoreCase("casada") ) {
            System.out.print("Quanto tempo de casada? (Anos) : ");
            Integer anos = scanner.nextInt();
        }

        System.out.println(" Ola " + nome + "Seu sexo: " + sexo + " Estado Civil: " + civil);
        System.out.println();
    }
}
