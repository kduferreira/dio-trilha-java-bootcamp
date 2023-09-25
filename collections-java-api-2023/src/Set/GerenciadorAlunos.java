package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno>alunoSet = new HashSet();

    public GerenciadorAlunos() {

    }



    public void adicionarAluno(Long matricula, String nome, double media){
        this.alunoSet.add(new Aluno(matricula,nome, media));
    }

    public void removerAluno(Long matricula){
        Aluno alunoRemovido = null;
        if (!this.alunoSet.isEmpty()){
            Iterator var6 = this.alunoSet.iterator();
            while (var6.hasNext()){
                Aluno a = (Aluno) var6.next();
                if (a.getMatricula().equals(matricula)){
                    alunoRemovido = a;
                    break;

                }
            }
    this.alunoSet.remove(alunoRemovido);
        }else {
            System.out.println("Lista esta vazia");
        }

    }

    public void  exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        System.out.println(alunosPorNome);
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet(new CompararPorNota());
        if (!this.alunoSet.isEmpty()){
        alunoSet.addAll(this.alunoSet);
        System.out.println(alunoPorNota);
        } else {
            System.out.println("Conjunto esta vazio!!!");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunoSet);
    }


    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno( 123456L, "João", 7.5);
        gerenciadorAlunos.adicionarAluno( 123457L, "Maria", 9.0);
        gerenciadorAlunos.adicionarAluno( 123458L, "Carlos", 5.0);
        gerenciadorAlunos.adicionarAluno( 123459L, "Ana", 6.8);
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunoSet);
        gerenciadorAlunos.removerAluno(0L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.alunoSet);
        gerenciadorAlunos.exibirAlunosPorNome();
        gerenciadorAlunos.exibirAlunosPorNota();

    }
}
