package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Calculadora_ResultadosTest {
    @Test
    public void testSumar(){
        //preparo
        Calculadora_Resultados cut = new Calculadora_Resultados();
        //ejecuto
        cut.sumar(5.6);
        //verifico
        double valorActual =  cut.getTotal();
        assertEquals(5.6,valorActual, 0.0001);
    }
}
