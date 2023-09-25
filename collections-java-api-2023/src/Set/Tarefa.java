package Set;

import java.util.Objects;

public class Tarefa {

    private String descricao;

    private Boolean tarefaConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.tarefaConcluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getTarefaConcluida() {
        return tarefaConcluida;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTarefaConcluida(Boolean tarefaConcluida) {
        this.tarefaConcluida = tarefaConcluida;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", tarefaConcluida=" + tarefaConcluida +
                '}';
    }
}

