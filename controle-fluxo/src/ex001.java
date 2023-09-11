import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o valor de A: ");
        Integer a = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        Integer b = scanner.nextInt();
        System.out.print("Digite o valor de C: ");
        Integer c = scanner.nextInt();

        Integer soma;

        soma = a + b ;
        if( soma > c) {
            System.out.println("A soma de A + B: " +
                    soma + " Valor de C: " + c);
            System.out.println("Soma é maior que C");
        }
    }
}
