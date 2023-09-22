package List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros  {

    private List<Integer> numeros = new ArrayList<>();


    public OrdenacaoNumeros() {
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
    List<Integer> numerosAcendentes = new ArrayList<>(this.numeros);
        if (!this.numeros.isEmpty()){
            Collections.sort(numerosAcendentes);
            return numerosAcendentes;
        } else {
            throw new RuntimeException("A lista esta vazia!");
        }

    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosDescendente = new ArrayList<>(this.numeros);

        if (!this.numeros.isEmpty()){
            numerosDescendente.sort(Collections.reverseOrder());
            return numerosDescendente;
        } else {
            throw  new RuntimeException("A lista esta vazia!");
        }
    }

}
