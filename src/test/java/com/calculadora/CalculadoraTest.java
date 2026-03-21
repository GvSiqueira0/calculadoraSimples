package com.calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testeSoma() {
        assertEquals(10.0, Calculadora.soma(4.0, 6.0));
    }

    @Test
    public void testeSubtracao() {
        assertEquals(2.0, Calculadora.subtracao(5.0, 3.0));
    }

    @Test
    public void testeMultiplicacao() {
        assertEquals(15.0, Calculadora.multiplicacao(3.0, 5.0));
    }

    @Test
    public void testeDivisao() {
        assertEquals(5.0, Calculadora.divisao(10.0, 2.0));
    }
}