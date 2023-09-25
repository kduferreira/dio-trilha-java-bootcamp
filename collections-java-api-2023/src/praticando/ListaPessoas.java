package praticando;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPessoas {


    private List<Pessoa> pessoaList;


    public ListaPessoas() {
        this.pessoaList = new ArrayList<>();
    }


    public void adicionarPessoas(String nome, Double altura, Integer idade){
    this.pessoaList.add(new Pessoa(nome, altura, idade));
    }


    public void removerPessoa(String nome) {
        List<Pessoa> pessoaRemovida = new ArrayList<>();
        for (Pessoa p : pessoaList){
            if (p.getNome().equalsIgnoreCase(nome));
            pessoaRemovida.add(p);
        }
        pessoaList.removeAll(pessoaRemovida);
    }


    public List<Pessoa>  ordenarPorIdade(){
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new CompararPorAltura());
        return pessoaPorAltura;
    }


}
