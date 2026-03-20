package com.calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testeSoma1() {
        double resultadoEsperado = 5.0;
        double resultadoRetornado = Calculadora.soma(2.0, 3.0);
        
        assertEquals(resultadoEsperado, resultadoRetornado);
    }

    @Test
    public void testeSoma2() {
        
        assertEquals(10.0, Calculadora.soma(4.0, 6.0));
    }

    @Test
    public void testeSubtracao() {
        assertEquals(2.0, Calculadora.subtracao(5.0, 3.0));
    }

    @Test
    public void testeDivisao() {
        assertEquals(2.0, Calculadora.divisao(10.0, 5.0));
    }
}