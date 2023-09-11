public class ResultadoEscolar {

    public static void main(String[] args) {

        int nota = 0;


        if(nota >= 7) {
            System.out.println("Aprovado");

        }else if (nota >= 4 && nota <7 ) {
            System.out.println("Recuperação ");

        }else if (nota >= 2 && nota <4) {
            System.out.println("Pede pontos para o professor");
        }else  {
        System.out.println("Muito burro pqp");
        }
    }
}
