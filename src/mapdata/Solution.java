package mapdata;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String args[]){
        Map<EmployeeKey,String> employeeKeySalMap = new HashMap<>();
        employeeKeySalMap.put(new EmployeeKey(1,"Test Employee","Dev"),"10000");
        employeeKeySalMap.put(new EmployeeKey(2,"Test2 Employee","Dev"),"20000");
        employeeKeySalMap.put(new EmployeeKey(3,"Test3 Employee","Dev"),"30000");
        employeeKeySalMap.put(new EmployeeKey(4,"Test4 Employee","Dev"),"40000");
        employeeKeySalMap.put(new EmployeeKey(5,"Test5 Employee","Dev"),"50000");
        employeeKeySalMap.put(new EmployeeKey(5,"Test5 Employee","Dev"),"60000");

        System.out.println(employeeKeySalMap);




    }
}
