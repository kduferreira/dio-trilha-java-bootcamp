import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        Integer numero = scanner.nextInt();


        if(numero % 2 ==0 ){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
}
