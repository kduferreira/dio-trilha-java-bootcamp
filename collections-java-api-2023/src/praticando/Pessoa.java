package praticando;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {


    private String nome;

    private Double altura;

    private Integer idade;


    public Pessoa(String nome, Double altura, Integer idade) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public Double getAltura() {
        return altura;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", idade=" + idade +
                '}';
    }



}
class CompararPorAltura implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
