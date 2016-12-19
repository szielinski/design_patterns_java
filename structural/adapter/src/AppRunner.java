import java.util.List;
import java.util.ArrayList;

public class AppRunner{
    public static void main(String[] args){
        LegacyEmployee legacyEmployee = new LegacyEmployee();
        legacyEmployee.name = "John:Doe";
        legacyEmployee.salary = "12000";

        List<Employee> employees = new ArrayList<>();
        employees.add(new LegacyEmployeeAdapter(legacyEmployee));

        System.out.println(employees.get(0));
    }
}
