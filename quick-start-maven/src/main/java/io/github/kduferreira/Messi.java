package io.github.kduferreira;

public class Messi {

    private String nome;

    private String sobrenome;

    private Integer idade;

    private String cpf;


    public Messi() {
    }


    public void Ispresente(){
        System.out.println("Presente, professor");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static void main(String[] args) {


        Messi m = new Messi();

        m.Ispresente();
    }
}


