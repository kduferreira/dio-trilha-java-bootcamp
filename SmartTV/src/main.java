
import java.util.Scanner;

public class main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);


        System.out.println("Qual é o seu nome? ");
        String nome = scanner.next();
        System.out.println("Qual é a sua idade?");
        Integer idade = scanner.nextInt();

        System.out.println("Qual é o seu cpf");
        String cpf = scanner.next();

        MyGirl myGirl = new MyGirl();
         myGirl.setNome(nome);
         myGirl.setIdade(idade);
         myGirl.setCpf(cpf);

        System.out.println("nome é: " + myGirl.getNome());
        System.out.println("idade é: " + myGirl.getIdade());
        System.out.println("cpf é: " + myGirl.getCpf());

        myGirl.anotar("Ferreira");
        System.out.println("nome é: " + myGirl.nome);


    }
}
