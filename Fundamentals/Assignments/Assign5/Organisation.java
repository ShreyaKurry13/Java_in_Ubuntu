import java.util.*;

public class Organisation {
    private String name;
    private String location;
    private int deptno;

    public static int autoDeptno = 100;
    public List<Employee> employees;

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public Organisation(String n,String l) {
        name = n;
        location =l;
        deptno = ++autoDeptno;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    public boolean deleteEmployee(Employee emp){
        return employees.remove(emp);
    }

    public Employee searchEmployee(int index){
        if (index >= 0 && index <= employees.size()) {
            return employees.get(index);
        }
        return null;
    }

    public void displayEmployee(){
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public double averageNetIncome(){
        if (employees.isEmpty()) return 0;
        double total = 0;
        for (Employee e : employees) {
            total += e.GetNetIncome();
        }
        return total/employees.size();
    }
}
