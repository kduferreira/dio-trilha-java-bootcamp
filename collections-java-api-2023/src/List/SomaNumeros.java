package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros = new ArrayList<>();


    public SomaNumeros() {

    }

    public void adicionarNumero(int numero){
        this.numeros.add(numero);
    }


    public int calcularSoma(){
        int soma = 0;

        Integer numero;
        if (this.numeros.isEmpty()) {
            throw new RuntimeException("Essa lista esta vazia");
        } else {
            for (Iterator iter = this.numeros.iterator(); iter.hasNext(); soma = soma + numero){
             numero = (Integer)iter.next();
            }
            return soma;
        }
    }


    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if (!this.numeros.isEmpty()) {
            Iterator var2 = this.numeros.iterator();

            while (var2.hasNext()){
                Integer numero = (Integer) var2.next();

                if (numero >= maiorNumero) {
                    maiorNumero= numero;
                }
            }
            return maiorNumero;
        } else {
            throw  new RuntimeException("A lista esta vazia!");
        }

    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if (!this.numeros.isEmpty()){
            Iterator var3 = this.numeros.iterator();

            while (var3.hasNext()){
                Integer numero = (Integer) var3.next();
                if (numero <= menorNumero){
                    menorNumero =numero;
                }
            }
            return menorNumero;
        } else {
            throw  new RuntimeException("A lista esta vazia");
        }
    }

    public void exibirNumeros(){
        if (!this.numeros.isEmpty()){
            System.out.println(numeros);
        }
    }

    public static void main(String[] args) {

        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(70);
        somaNumeros.adicionarNumero(7);
        System.out.println("Adicionando numeros ");
        somaNumeros.exibirNumeros();
        System.out.println("O menor numero é " +  somaNumeros.encontrarMenorNumero());
        System.out.println("O maior numero é "  + somaNumeros.encontrarMaiorNumero());
    }
}
