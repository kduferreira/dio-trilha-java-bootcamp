package io.github.kduferreira;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTest {


@Test
    void validarCalculoDeIdade(){
        Pessoa pessoa = new Pessoa("julia", LocalDate.of(2020,1,1));
    Assertions.assertEquals(3, pessoa.getIdade());
    }



    @Test
    void deveretornarMaior(){
        Pessoa pessoa = new Pessoa("julia", LocalDate.of(2000,1,1));
        Assertions.assertTrue(pessoa.ehMaiorDeIdade());


        Pessoa pessoa1 = new Pessoa("leandro", LocalDate.of(2006, 3, 4));
        Assertions.assertFalse(pessoa1.ehMaiorDeIdade());
    }
}
