package io.github.kduferreira;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class BdTestes {




    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexao();
        System.out.println("Inicializando....");
    }



    @BeforeEach
    void iserirDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("julia", LocalDate.of(2000,1,1)));
    }
    @Test
     void validarDados(){
        Assertions.assertTrue(true);
    }


    @BeforeEach
    void removerDadosParaTeste(){
        BancoDeDados.removerDados(new Pessoa("julia", LocalDate.of(2000,1,1)));
    }


    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
        System.out.println("fim.");
    }
}
