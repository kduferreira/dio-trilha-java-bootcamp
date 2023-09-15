import java.text.DecimalFormat;
import java.util.Scanner;

public class jurosComposto {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);


                double valorInicial = scanner.nextDouble();


                double taxaJuros = scanner.nextDouble();

                int periodo = scanner.nextInt();



         DecimalFormat df = new DecimalFormat("#,##0.00");


                double valorFinal = calcularValorFinal(valorInicial, taxaJuros, periodo);

                //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.


                System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

                scanner.close();
            }

    public static double calcularValorFinal(double valorInicial, double taxaJuros, int periodo){
        double valorFinal = valorInicial * Math.pow(1 + taxaJuros, periodo);
        return  valorFinal;
    }
        }
