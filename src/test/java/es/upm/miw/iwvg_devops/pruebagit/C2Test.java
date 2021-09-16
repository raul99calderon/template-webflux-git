package es.upm.miw.iwvg_devops.pruebagit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class C2Test {

    @Test
    void getHelloWorld() {
        assertEquals(new C2().getHelloWorld(),"Hello World");
    }

    @Test
    void getNum() {
        assertEquals(new C2().getNum(),2);
    }
}