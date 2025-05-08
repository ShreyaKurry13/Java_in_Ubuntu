public class Program {

    public static void main(String[] args) {
        
        Organisation org =  new Organisation("Tech Company", "Mumbai");

        Employee e1 = new Employee(120, 50);
        Employee e2 = new Employee(110, 42);
        SalesPerson s1 = new SalesPerson(115,23,50000);
        SalesPerson s2 = new SalesPerson(105,85,25000); 

        org.addEmployee(e1);
        org.addEmployee(e2);
        org.addEmployee(s1);
        org.addEmployee(s2);

        System.out.printf("%s , %s \n",org.getName(),org.getLocation());

        System.out.println("List of Employees ");
        org.displayEmployee();

        System.out.printf("Average Net Income of employees = %.2f \n",org.averageNetIncome());
    }
}