package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListaTarefas {


    private Set<Tarefa> tarefaSet;


    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        this.tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        Tarefa tarefaRemover = null;
        if (!this.tarefaSet.isEmpty()){
            Iterator var1 = this.tarefaSet.iterator();

            while (var1.hasNext()){
                Tarefa t = (Tarefa)var1.next();
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaRemover = t;
                    break;
                }
            }
            this.tarefaSet.remove(tarefaRemover);
            } else {
            System.out.println("O conjunto esta vazio");
        }
        if (tarefaRemover == null){
            System.out.println("Tarefa nao encontrada!");
        }
        }


        public void exibirTarefas(){
            System.out.println(tarefaSet);
        }


        public int contarTarefas(){
        return this.tarefaSet.size();
        }


        public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        Iterator var3 =this.tarefaSet.iterator();

        while (var3.hasNext()){
            Tarefa t = (Tarefa) var3.next();
            if (t.getTarefaConcluida()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
        }


        public Set<Tarefa> obterTarefasNaoConcluidas(){
        Set<Tarefa> tarefasNaoConcluidas = new HashSet<>();
        Iterator var4 = tarefasNaoConcluidas.iterator();

        while (var4.hasNext()){
            Tarefa t = (Tarefa) var4.next();
            if (!t.getTarefaConcluida()){
                tarefasNaoConcluidas.add(t);
            }
        }
        return tarefasNaoConcluidas;
        }


        public void marcarTarefaConcluida(String descricao){
        Iterator var2 = this.tarefaSet.iterator();

        while (var2.hasNext()){
            Tarefa t = (Tarefa) var2.next();
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                t.setTarefaConcluida(true);
            }
        }
        }

        public void marcarTarefaPendente(String descricao){
        Tarefa tarefaPendente = null;
        Iterator var3 = this.tarefaSet.iterator();

        while (var3.hasNext()){
            Tarefa t = (Tarefa) var3.next();
            if (!t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaPendente = t;
                break;
            }
        }
        if (tarefaPendente != null){
            if (tarefaPendente.getTarefaConcluida()){
                tarefaPendente.setTarefaConcluida(false);
            }
        } else {
            throw new RuntimeException("Tarefa nao encontrada");
        }
        }

        public void   limparListaTarefas(){
        Tarefa listaRemover = null;
        if (this.tarefaSet.isEmpty()){
            System.out.println("Lista ja esta vazia");
        }else {
            tarefaSet.clear();
        }
        }

    public static void main(String[] args) {

    }
    }

