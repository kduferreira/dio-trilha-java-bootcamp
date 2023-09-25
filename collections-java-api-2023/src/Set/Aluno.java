package Set;

import java.util.Comparator;
import java.util.Objects;

public class Aluno  implements   Comparable<Aluno>{

    private Long matricula;

    private String nome;

    private Double media;

    public Aluno(Long matricula, String nome, Double media) {
        this.matricula = matricula;
        this.nome = nome;
        this.media = media;
    }


    @Override
    public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }
    public Long getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public Double getMedia() {
        return media;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", media=" + media +
                '}';
    }

}
class CompararPorNota implements Comparator<Aluno> {

    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(), a2.getMedia());
    }
}
