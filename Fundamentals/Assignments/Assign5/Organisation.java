import java.util.ArrayList;
import java.util.List;

public class Organisation {
    private String name;
    private String location;
    private int deptno;

    public static int autoDeptno = 100;
    public List<Employee> employees;

    public Organisation(String n,String l) {
        name = n;
        location =l;
        deptno = ++autoDeptno;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    public Employee deleteEmployee(Employee emp){
        return employees.remove(emp);
    }

    public Employee searchEmployee(int index){
        if (index >= 0 && index <= employees.size()) {
            return employees.get(index);
        }
        return null;
    }

    public double AverageNetIncome(Employee emp){
        return 0;
    }
}
