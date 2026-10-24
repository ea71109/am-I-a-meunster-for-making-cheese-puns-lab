package org.example;

public class CheeseRowCleaner {

    public String cleanRows(String singleLine) {
        if (singleLine == null)
        {
            return "";
        }
        return singleLine.replaceAll("\"[^\"]*\"", "");
    }
}
