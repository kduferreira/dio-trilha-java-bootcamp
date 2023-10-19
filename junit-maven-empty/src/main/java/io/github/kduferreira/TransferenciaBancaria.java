package io.github.kduferreira;

public class TransferenciaBancaria {




    public void TransferirDinheiro(Conta contaDestino, Conta contaAtual, int valor){
        if (valor <= 0){
            throw new IllegalArgumentException("o valor tem que ser acima de zero");
        }
    }
}
