package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {


    private Set<String> conju;


    public ConjuntoPalavrasUnicas() {
        this.conju = new HashSet<>();
    }

    public Set<String> getConju() {
        return conju;
    }


    public void adicionarPalavra(String palavra){
        this.conju.add(palavra);
    }




    public void removerPalavra(String palavra){
        if (!this.getConju().isEmpty()){
            if (this.getConju().contains(palavra)){
                this.conju.remove(palavra);
                System.out.println("Palavra removida com sucesso");
            } else {
                System.out.println("Palavra nao encontrada");
            }
        } else {
            throw new RuntimeException("A lista esta vazia");
        }
    }

    public Boolean verificarPalavra(String palavra) {
        return this.conju.remove(palavra);
    }


    public void exibirPalavrasUnicas(){
        if (!this.getConju().isEmpty()){
            System.out.println(this.conju);
        } else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {

        ConjuntoPalavrasUnicas c = new ConjuntoPalavrasUnicas();


        c.adicionarPalavra("arroz");
        c.adicionarPalavra("arroz");
        c.adicionarPalavra("carne");
        c.adicionarPalavra("feijão");
        c.adicionarPalavra("feijão");
        c.adicionarPalavra("feijão");
        c.adicionarPalavra("feijão");
        c.adicionarPalavra("feijão");
        c.adicionarPalavra("feijão");
        c.adicionarPalavra("salmão");

       c.exibirPalavrasUnicas();
       c.removerPalavra("arroz");
        System.out.println("Palavra removida com sucesso");
       c.exibirPalavrasUnicas();

        System.out.println("A palavra verificada foi " + c.verificarPalavra("arroz") );
    }
}
