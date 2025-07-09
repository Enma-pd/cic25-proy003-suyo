package es.cic.curso25;

import org.junit.jupiter.api.Test;

public class Calculadora_ResultadosTest {
    @Test
    public void testLanzar(){
        Calculadora_Resultados c = new Calculadora_Resultados();
        Calculadora_Resultados d = c;
        c.total=3;   
        c= new Calculadora_Resultados();
        c.total=4.5;
    }
    @Test
    public void testLanzar2(){
        Calculadora_Resultados c = new Calculadora_Resultados();
        Calculadora_Resultados d = new Calculadora_Resultados();
        c.total=3;   
        d.total=3;
    }
}
