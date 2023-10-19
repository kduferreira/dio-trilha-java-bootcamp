package io.github.kduferreira;

import org.junit.jupiter.api.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrdemTest {


    @Order(6)
    @Test
    void Teste01(){
        Assertions.assertTrue(true);
    }
    @Order(5)
    @Test
    void Teste02(){
        Assertions.assertTrue(true);
    }

    @Order(4)
    @Test
    void Teste03(){
        Assertions.assertTrue(true);
    }
    @Order(3)
    @Test
    void Teste04(){
        Assertions.assertTrue(true);
    }
    @Order(2)
    @Test
    void Teste05(){
        Assertions.assertTrue(true);
    }

    @Order(1)
    @Test
    void Teste06(){
        Assertions.assertTrue(true);
    }

}
