import java.util.Scanner;

public class projeto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametro1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o segundo parametro");
        int parametro2 = scanner.nextInt();
        scanner.nextLine();

        try {
            contar(parametro1, parametro2);
        }catch (ParametrosInvalidosException e ) {
            System.out.println("Erro " + e.getMessage());
        }

    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm > parametroDois){

          throw new ParametrosInvalidosException("ParametroUm deve ser menor ou igual a parametroDois");
        }
        int contagem = parametroDois - parametroUm + 1;
        for (int x = parametroUm; x <= parametroDois; x++){
            System.out.println(x);
        }

    }


}
