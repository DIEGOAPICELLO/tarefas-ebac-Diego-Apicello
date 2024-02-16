import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TesteMulheres {

    @Test
    public void testPresentedNames(){
        String inputNames = "Maria, Ingrid, Laurisete";
        List<String> expectedNames = List.of("Maria", "Ingrid", "Laurisete");
        List<String> actualNames = Main.presentedNames(inputNames);
        assertEquals(expectedNames, actualNames);
    }

    @Test
    public void testGenderName() {
        String inputNames = "Maria, F, Ingrid, F, Laurisete, F";
        List<Pessoas> expectedGenderNames = List.of(
                new Pessoas("Maria", "F"),
                new Pessoas("Ingrid", "F"),
                new Pessoas("Lauriste" , "F")
        );

        List<Pessoas> actualGenderNames = Main.genderName(inputNames);
        System.out.println(actualGenderNames);

    }

    @Test
    public void testWoman() {
        List<Pessoas> pessoas = List.of(
                new Pessoas("Maria", "F"),
                new Pessoas("Joao", "M"),
                new Pessoas("ingrid", "F"),
                new Pessoas("Diego", "M"),
                new Pessoas("Laurisete", "F")
        );

        assertTrue(Main.hasWoman(pessoas));

    }
}
