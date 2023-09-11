import java.util.Scanner;

public class ex008 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o primeiro valor");
            Integer numero1 = scanner.nextInt();

        System.out.println("Digite o segundo valor");
        Integer numero2 = scanner.nextInt();

        System.out.println("Digite o terceiro valor");
        Integer numero3 = scanner.nextInt();


        Integer temp;
        if(numero1 < numero2) {
            temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        } if (numero2 < numero3) {
            temp = numero2;
            numero2 = numero3;
            numero3 = temp;

        }if (numero1 < numero2) {
           temp = numero1;
            numero1 = numero2;
            numero2 = temp;
        }

        System.out.println("Os números em ordem decrescente são: " + numero1 + ", " + numero2 + ", " + numero3);
    }

    }

