import java.util.Random;
import java.util.Scanner;

public class Aleatorios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Integer num_aleatorio;

        num_aleatorio = random.nextInt(10) + 1;

        switch (num_aleatorio){
            case 1 : {
                System.out.println("o numero aleatorio é 1");
                break;
            }
            case 2 : {
                System.out.println("o numero aleatorio é 2");
                break;
            }
            case 3 : {
                System.out.println("o numero aleatorio é 3");
                break;
            }
            case 4 : {
                System.out.println("o numero aleatorio é 4");
                break;
            }
            case 5 : {
                System.out.println("o numero aleatorio é 5");
                break;
            }
            case 6 : {
                System.out.println("o numero aleatorio é 6");
                break;
            }
            case 7 : {
                System.out.println("o numero aleatorio é 7");
                break;
            }
            case 8 : {
                System.out.println("o numero aleatorio é 8");
                break;
            }
            case 9 : {
                System.out.println("o numero aleatorio é 9");
                break;
            }
            case 10 : {
                System.out.println("o numero aleatorio é 10");
                break;
            }

        }
    }
}
