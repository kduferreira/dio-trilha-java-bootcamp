package io.github.kduferreira;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class CondicionaisTeste {



//    @Test
//            @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17) // para o teste so rodar entre o java 11 e o java 17
//           // @EnabledOnOs(OS.WINDOWS)
////    @EnabledIfEnvironmentVariable(named = "USERS", matches = "Aaron")
//    void validarAlgoPorUsuarioAaron(){
//        Assertions.assertEquals(10, 5 + 5);
//    }



//    @Test
//    void tranferenciaBancariaTeste(){
//     Conta contaOrigem  = new Conta(21312312, 0);
//        Conta contaDestino = new Conta(45456456, 200);
//
//        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria();
//        Assertions.assertThrows(IllegalArgumentException.class, () ->  transferenciaBancaria.TransferirDinheiro(contaOrigem, contaDestino, -1));
//    }


    @Test
    void tranferenciaBancariadoesthow(){
        Conta contaOrigem  = new Conta(21312312, 0);
        Conta contaDestino = new Conta(45456456, 200);

        TransferenciaBancaria transferenciaBancaria = new TransferenciaBancaria();
        Assertions.assertDoesNotThrow( () ->  transferenciaBancaria.TransferirDinheiro(contaOrigem, contaDestino, 41));
    }

}
