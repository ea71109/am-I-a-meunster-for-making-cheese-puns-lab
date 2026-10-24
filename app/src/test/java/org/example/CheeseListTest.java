package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CheeseListTest {
    CheeseList list = new CheeseList();
    private Cheese cheeseOne = new Cheese("raw", 0, 42.0, "Buffalo");
    private Cheese cheeseTwo = new Cheese("pasteurized", 1, 35.0, "Cow");
    private Cheese cheeseThree = new Cheese("Raw milk", 1, 43.0, "Goat");
    private Cheese cheeseFour = new Cheese("Pasteurized", 0, 1.0, "Cow");

    @Test
    public void checkingZeroCheesesTest()
    {
        assertEquals(0, list.getListSize());
    }

    @Test
    public void addingCheeseTest()
    {
        list.addCheese(cheeseOne);
        assertEquals(1, list.getListSize());
    }

    @Test
    public void addingTwoCheesesTest()
    {
        list.addCheese(cheeseOne);
        list.addCheese(cheeseTwo);
        assertEquals(2, list.getListSize());
    }

    @Test
    public void countTypesOfCheeseTest()
    {
        list.addCheese(cheeseOne);
        list.addCheese(cheeseTwo);
        list.addCheese(cheeseThree);
        list.addCheese(cheeseFour);
        assertEquals(2, list.countPasteurized());
        assertEquals(2, list.countRaw());
    }

    @Test
    public void countOrganicAndHighMoistureCheesesTest()
    {
        list.addCheese(cheeseOne);
        list.addCheese(cheeseTwo);
        list.addCheese(cheeseThree);
        list.addCheese(cheeseFour);
        assertEquals(1, list.countOrganicHighMoisture());
    }

    @Test
    public void findMostCommonTypeOfCheeseTest()
    {
        list.addCheese(cheeseOne);
        list.addCheese(cheeseTwo);
        list.addCheese(cheeseThree);
        list.addCheese(cheeseFour);
        assertEquals("Cow", list.findMostCommonType());
    }




}
