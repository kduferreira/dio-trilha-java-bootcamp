package Map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionariosMap;


    public Dicionario() {
        this.dicionariosMap = new HashMap<>();
    }


    public void adicionarPalavra(String palavra, String definicao){
        this.dicionariosMap.put(palavra,definicao);
    }


    public  void removerPalavra(String palavra){
        this.dicionariosMap.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(dicionariosMap);
    }


    public String pesquisarPorPalavra(String palavra){
        String definicao = (String) dicionariosMap.get(palavra);
        return definicao;
    }



}
