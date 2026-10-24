package org.example;

public class CheeseParser {

    public Cheese parseLines(String line)
    {
        if (line == null || line.isEmpty())
        {
            return null;
        }

        String[] columns = line.split(",");

        if (columns.length > 9)
        {
            try {
                double moisture = 0.0;
                if (!columns[3].trim().isEmpty())
                {
                    moisture = Double.parseDouble(columns[3].trim());
                }
                int organic = Integer.parseInt(columns[6].trim());
                String milkType = columns[8];
                String treatment = columns[9];
                return new Cheese(treatment, organic, moisture, milkType);
                }
            catch (NumberFormatException e)
            {
                return null;
            }
        }
        return null;
    }
}
