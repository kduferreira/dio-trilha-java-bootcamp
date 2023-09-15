package EstadosBrasileiros;

public class IBGE {
    public static void main(String[] args) {

        for (EstadoBrasileiro e : EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + "-" + e.getNome() + "-" + e.getIbge());
        }
        EstadoBrasileiro e2 = EstadoBrasileiro.MARANHAO;
        System.out.println(e2.getNomeMaiusculo());

    }
}
