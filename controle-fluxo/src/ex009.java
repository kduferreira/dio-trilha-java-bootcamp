import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        Double altura = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o seu sexo: ");
        String sexo = scanner.nextLine();
        Double peso;

        if(sexo.equalsIgnoreCase("masculino")) {
            peso = (72.7 * altura) - 58;
        } else  {
            peso = (62.1 * altura) - 44.7;
        }

        System.out.println("Sua Altura é :" + altura + "e seu peso ideal é: " + peso);
    }
}
