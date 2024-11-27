import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculadoraTest  {

    @Test
    public void soma() {
        final Calculadora calculadora = new Calculadora();

        final int soma = calculadora.somar(1 , 2);
        assertEquals(3, soma);
    }


    @Test
    public void subtrair() {
        final Calculadora calculadora = new Calculadora();

        final int subtrair = calculadora.subtrair(6 , 2);
        assertEquals(4, subtrair);
    }


    @Test
    public void multiplicar() {
        final Calculadora calculadora = new Calculadora();

        final int multiplicar = calculadora.multiplicar(3 , 2);
        assertEquals(6, multiplicar);
    }


    @Test
    public void dividir() {
        final Calculadora calculadora = new Calculadora();

        final int dividir = calculadora.dividir(5 , 5);
        assertEquals(1, dividir);
    }
}
