package day64_MapContinue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepresentingTable {
    public static void main(String[] args) {
        // for single row
        // i want to get the value by it's column name
        // so i choose Map

        Map<String,String> row1 = new HashMap<>();
        row1.put("first_name", "Regan" );
        row1.put("email", "rboichat0@1688.com" );
        row1.put("gender", "Female" );

        Map<String,String> row2 = new HashMap<>();
        row2.put("first_name", "Carleen" );
        row2.put("email", "cmorillas1@blog.com" );
        row2.put("gender", "Female" );

        System.out.println("row1 = "+ row1);
        System.out.println("row2 = "+ row2);

        // for one row I used one map
        // but I have many rows !
        // may of Some type -->> List<SomeType>

        List<Map<String,String>> rowMapList = new ArrayList<>();

        rowMapList.add(row1);
        rowMapList.add(row2);

        System.out.println("rowMapList = " + rowMapList);
        // How do I get 2nd row email column value
        System.out.println("rowMapList.get(1).get(\"email\") = " + rowMapList.get(1).get("email"));



    }
}
