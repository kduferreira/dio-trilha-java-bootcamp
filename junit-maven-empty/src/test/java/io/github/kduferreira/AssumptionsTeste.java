package io.github.kduferreira;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {




        @Test
        void validarAlgoPorUsuarioAaron(){
            Assumptions.assumeFalse("Aaron".equals(System.getenv("USERS")));
            Assertions.assertEquals(10, 5 + 5);
        }
    }
