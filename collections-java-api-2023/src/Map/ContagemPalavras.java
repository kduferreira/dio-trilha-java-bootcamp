package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();

    }

    public void adicionarPalavra(String palavra, Integer contagem){
        this.contagemPalavrasMap.put(palavra,contagem);
    }

    public void removerPalavra(String palavra){
        this.contagemPalavrasMap.remove(palavra);
    }

    public int exibirContagemPalavras(){
        int contagemTotal = 0;


        int contagem;
        for (Iterator var2 = this.contagemPalavrasMap.values().iterator(); var2.hasNext(); contagemTotal += contagem){
            contagem = (Integer) var2.next();
        }
        return contagemTotal;

    }

public String encontrarPalavraMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem  =0;
        Iterator var3 = contagemPalavrasMap.entrySet().iterator();

        while (var3.hasNext()){
            Map.Entry<String, Integer> entry = (Map.Entry)var3.next();
            if ((Integer) entry.getValue() > maiorContagem){
                maiorContagem = (Integer) entry.getValue();
                linguagemMaisFrequente = (String) entry.getKey();
            }
        }
        return linguagemMaisFrequente;


}



}
