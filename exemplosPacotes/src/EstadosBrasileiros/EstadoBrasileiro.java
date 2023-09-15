package EstadosBrasileiros;

// Criando o enum EstadoBrasileiro para ser usado em toda a aplicação.
public enum EstadoBrasileiro {
    SAO_PAULO ("SP","São Paulo", 12),
    RIO_JANEIRO ("RJ", "Rio de Janeiro", 15),
    PIAUI ("PI", "Piauí", 21),
    MARANHAO ("MA","Maranhão", 20),
    MINAS_GERAIS("MG", "Minas Gerais", 9);


    private String nome;
    private String sigla;

    private Integer ibge;
    private EstadoBrasileiro(String sigla, String nome, int ibge ) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNome() {
        return nome;
    }
    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
    public Integer getIbge() {
        return ibge;
    }

}
