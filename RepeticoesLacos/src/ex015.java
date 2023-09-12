import java.util.Scanner;

public class ex015 {

    public static void main(String[] args) {

        //Escreva um algoritmo que leia uma sequência de números do usuário e realize a
        //soma desses números. Encerre a execução quando um número negativo for digitado

        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite uma sequencia de numero");

        while (true){

            System.out.print("Digite um numero : ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            if (numero < 0){
                break;
            }
            soma = soma + numero;
        }
        System.out.println("A soma dos valores digitados é " + soma);

        }

    }

