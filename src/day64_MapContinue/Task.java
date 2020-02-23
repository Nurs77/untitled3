package day64_MapContinue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task {
    public static void main(String[] args) {
        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "Female");
        employeeMap.put("Winfred", "Male");
        employeeMap.put("Jereme", "Male");
        employeeMap.put("Glad", "Female");
        employeeMap.put("Desirae", "Female");
        employeeMap.put("Kakalina", "Female");
        employeeMap.put("Bertrando", "Male");
        employeeMap.put("Ajay", "Female");
        employeeMap.put("Brigitte", "Female");
        employeeMap.put("Derk", "Male");
        employeeMap.put("Orlando", "Male");
        employeeMap.put("Selle", "Female");
        employeeMap.put("Marika", "Female");
        employeeMap.put("Griffy", "Male");
        employeeMap.put("Shanon", "Female");
        employeeMap.put("Clerkclaude", "Male");
        employeeMap.put("Rickard", "Male");
        employeeMap.put("Job", "Male");
        employeeMap.put("Aida", "Female");
        employeeMap.put("Alonzo", "Male");

        System.out.println("employeeMap = " + employeeMap);
        
        Set<Map.Entry<String,String>> entryView = employeeMap.entrySet();
        for (Map.Entry<String, String> eachFemale:entryView){
           if (eachFemale.getValue().equals("Female")){
               eachFemale.setValue("Queen");

               System.out.println("eachFemale.getKey() = " + eachFemale.getKey());
           }else{
               eachFemale.setValue("King");
           }
            
        }

        System.out.println("employeeMap = " + employeeMap);
    }
}
