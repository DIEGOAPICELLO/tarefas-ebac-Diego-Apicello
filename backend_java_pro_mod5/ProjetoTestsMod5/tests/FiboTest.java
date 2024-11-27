import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FiboTest {

    @Test
    public void testEncontrarElementoParaValoresBase() {

        assertEquals(3,Fibo.encontrarElemento(4));
        assertEquals(1,Fibo.encontrarElemento(2));
    }
    @Test
    public void testEncontrarElementoParaValoresMaiores() {

        assertEquals(8,Fibo.encontrarElemento(6));
        assertEquals(34,Fibo.encontrarElemento(9));
    }
    @Test
    public void testEncontrarElementoParaValoresGrandes() {

        assertEquals(610,Fibo.encontrarElemento(15));
        assertEquals(6765,Fibo.encontrarElemento(20));
    }

}
