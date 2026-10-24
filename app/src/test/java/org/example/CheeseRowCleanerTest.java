package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheeseRowCleanerTest {
    CheeseRowCleaner cleaner = new CheeseRowCleaner();
    String line = "228,NB,Farmstead,47.0,\"Sharp, lactic\",Uncooked,0,Firm Cheese,Ewe,Raw Milk,Washed Rind,Sieur de Duplessis (Le),lower fat";

    @Test
    public void cleanLineTest()
    {
        assertEquals("228,NB,Farmstead,47.0,,Uncooked,0,Firm Cheese,Ewe,Raw Milk,Washed Rind,Sieur de Duplessis (Le),lower fat",cleaner.cleanRows(line));
    }
}
