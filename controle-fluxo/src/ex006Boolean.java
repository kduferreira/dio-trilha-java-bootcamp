import java.util.Scanner;

public class ex006Boolean {
    public static void main(String[] args) {
       Boolean valor1 = false;
       Boolean valor2 = false;
        if(valor1 && valor2){
            System.out.println("os Valores sao verdadeiros ");
        } else if (!valor1 && !valor2) {
            System.out.println("os Valores sao falsos");
        } else {
            System.out.println("Um valor é verdadeiro e outro é falso");
        }

    }

}
