public class OperadorLogico {

    public static void main(String[] args) {
        boolean a = false;
        boolean b = true;

        if (a && b) {
            System.out.println("As duas condicoes sao verdadeiras");
        }

        if (a | b) {
            System.out.println("Uma das condicoes sao verdadeiras");
        }

        if ( b && (100 < 200)) {
            System.out.println("As duas condicoes sao verdadeiras");
        }
    }
}
