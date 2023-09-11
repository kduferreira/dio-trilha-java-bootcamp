import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sua altura: ");
        Double altura = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Digite o seu peso: ");
        Double peso = scanner.nextDouble();
        Double imc;

       imc = peso / (altura * altura);

       if( imc < 18.5){
           System.out.println("Abaixo do peso");
       }else if (imc >= 18.5 && imc <25) {
           System.out.println("Peso normal ");
       }else if (imc >= 25 && imc <30 ) {
            System.out.println("Acima do peso ");
       }else if (imc >= 30){
            System.out.println("obeso");
        }else {
            System.out.println("Valor invalido");
        }


    }
}
