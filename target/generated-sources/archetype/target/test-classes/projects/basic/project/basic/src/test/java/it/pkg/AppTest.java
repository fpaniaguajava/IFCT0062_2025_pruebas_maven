package it.pkg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import it.pkg.util.Calculadora;
import org.junit.jupiter.api.Test;

public class AppTest {
    @Test
    public void testSumar() {
        assertEquals(5, Calculadora.sumar(2, 3));
        assertEquals(0, Calculadora.sumar(-1, 1));
        assertEquals(-5, Calculadora.sumar(-2, -3));
    }

    @Test
    public void testRestar() {
        assertEquals(1, Calculadora.restar(3, 2));
        assertEquals(-2, Calculadora.restar(-1, 1));
        assertEquals(1, Calculadora.restar(-2, -3));
    }

    @Test
    public void testMultiplicar(){
        assertEquals(10, Calculadora.multiplicar(5,2));
        assertEquals(-10, Calculadora.multiplicar(-5,2));
        assertEquals(0, Calculadora.multiplicar(5,0));
    }

    @Test
    public void testDividir(){
        assertEquals(2,Calculadora.dividir(20, 10));
        assertEquals(0,Calculadora.dividir(0,20));
    }
}

