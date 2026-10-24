package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheeseTest {
    private Cheese rawOrganicCheese;
    private Cheese pasteurizedCheese;

    @BeforeEach
    public void setUp()
    {
        rawOrganicCheese = new Cheese("Raw Milk", 1, 42.0, "Cow");
        pasteurizedCheese = new Cheese("Pasteurized", 0, 25.0, "Goat");
    }

    @Test
    public void isCheeseRawTest()
    {
        assertTrue(rawOrganicCheese.isRaw());
        assertFalse(pasteurizedCheese.isRaw());
    }

    @Test
    public void isCheesePasteurizedTest()
    {
        assertTrue(pasteurizedCheese.isPasteurized());
        assertFalse(rawOrganicCheese.isPasteurized());
    }

    @Test
    public void isCheeseOrganicAndHighMoistureTest()
    {
        assertTrue(rawOrganicCheese.isOrganicAndHighMoisture());
        assertFalse(pasteurizedCheese.isOrganicAndHighMoisture());
    }
}
