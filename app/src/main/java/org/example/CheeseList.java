package org.example;

import java.util.ArrayList;

public class CheeseList {
    private ArrayList<Cheese> cheeses = new ArrayList<>();

    public void addCheese(Cheese cheese)
    {
        cheeses.add(cheese);
    }

    public int countPasteurized()
    {
        int count = 0;
        for (Cheese cheese : cheeses)
        {
            if (cheese.isPasteurized())
            {
                count++;
            }
        }
        return count;
    }

    public int countRaw()
    {
        int count = 0;
        for (Cheese cheese : cheeses)
        {
            if ( cheese.isRaw())
            {
                count++;
            }
        }
        return count;
    }

    public int countOrganicHighMoisture()
    {
        int count = 0;
        for (Cheese cheese : cheeses)
        {
            if (cheese.isOrganicAndHighMoisture())
            {
                count++;
            }
        }
        return count;
    }

    public String findMostCommonType()
    {
        int cow = 0, goat = 0, ewe = 0, buffalo = 0;

        for (Cheese cheese : cheeses)
        {
            String type = cheese.getMilkType();
            if (type.contains("cow"))
            {
                cow++;
            }
            else if (type.contains("goat"))
            {
                goat++;
            }
            else if (type.contains("ewe"))
            {
                ewe++;
            }
            else
            {
                buffalo++;
            }
        }
        String popularType = "Cow";
        int max = cow;

        if (goat > max)
        {
            popularType = "Goat";
        }
        if (ewe > max)
        {
            popularType = "Ewe";
        }
        if (buffalo > max)
        {
            popularType = "Buffalo";
        }
        return popularType;
    }

    public int getListSize()
    {
        return cheeses.size();
    }

}
