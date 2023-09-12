import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {

        // Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova

        int idadeMaisNova = Integer.MAX_VALUE;
        String nomeMaisNova = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o os campos abaixo");



        for (int x = 0; x < 10; x++){

            System.out.print("Nome da Pessoa " + ( x + 1 ) +  ": ");
            String nome = scanner.nextLine();
            System.out.print("A idade da " + ( x + 1 ) + " : ");
            int idade = scanner.nextInt();
            scanner.nextLine();
            if(idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNova = nome;

            }


        }
        System.out.println("Idade da pessoa mais nova é " + nomeMaisNova + " Com idade de " + idadeMaisNova);
    }
}
