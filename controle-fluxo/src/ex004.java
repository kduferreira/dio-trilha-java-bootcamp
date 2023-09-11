import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor ");
        Integer a = scanner.nextInt();
        System.out.println("Digite o segund valor: ");
        Integer b = scanner.nextInt();
        Integer c;


        if( a == b ){
            c = a + b;
        }else{
            c = a * b;
        }
        System.out.println("O resultado é: " + c);



    }
}
