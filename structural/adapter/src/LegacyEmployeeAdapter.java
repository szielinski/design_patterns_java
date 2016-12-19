public class LegacyEmployeeAdapter implements Employee{

    private LegacyEmployee legacyEmployee;

    public LegacyEmployeeAdapter(LegacyEmployee legacyEmployee){
        this.legacyEmployee = legacyEmployee;
    }

    public String getFirstName(){
        if(legacyEmployee.name.contains(":"))
            return legacyEmployee.name.split(":")[0];
        return "";
    }
    public String getLastName(){
        if(legacyEmployee.name.contains(":"))
            return legacyEmployee.name.split(":")[1];
        return "";
    }
    public int getSalary(){
        return Integer.parseInt(legacyEmployee.salary);
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("First name: ").append(getFirstName()).append("\n");
        sb.append("Last name: ").append(getLastName()).append("\n");
        sb.append("Salary: ").append(getSalary());
        
        return sb.toString();
    }
}
