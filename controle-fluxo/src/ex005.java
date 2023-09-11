import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor");
        Integer valor = scanner.nextInt();
        Integer resultado;

        if( valor > 0){
            resultado = valor *2;
            System.out.println("O dobro do valor é: " + resultado);
        } else {
            resultado = valor *3;
            System.out.println("O Triplo do valor é: " + resultado);
        }
    }
}
