package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheeseParserTest {
    String line = "1116,BC,Farmstead,40.3,,,1,Soft Cheese,Cow,Pasteurized,Bloomy Rind,Ash-Ripened Camembert,lower fat";
    CheeseParser parser = new CheeseParser();

    @Test
    public void oneLineParsedTest()
    {
        Cheese parsedCheese = parser.parseLines(line);
        assertEquals(40.3, parsedCheese.getMoisturePercent());
        assertEquals(1, parsedCheese.getOrganic());
        assertEquals("cow", parsedCheese.getMilkType());
        assertEquals("pasteurized", parsedCheese.getMilkTreatmentType());
    }
}
