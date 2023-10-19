package io.github.kduferreira;

public class Conta {


    private  Integer numeroConta;


    private Integer saldo;


    public Conta(Integer numeroConta, Integer saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }


    public Integer getnumeroConta() {
        return numeroConta;
    }

    public Integer getSaldo() {
        return saldo;
    }
}
