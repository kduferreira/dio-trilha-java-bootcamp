import java.util.Random;

public class JoaoTelefone {
    public static void main(String[] args) {

        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        }while (tocando());
    }
    public static boolean tocando() {
        boolean atendeu = new Random().nextInt(10)==1;
        System.out.println("Atendeu? " + atendeu);

        return ! atendeu;
    }
}
