import java.util.ArrayList;
import java.util.Collection;

record Item (String name,String brand) {}

record Customer (String id,double purchase,int rating) implements Comparable<Customer>{

    @Override
    public int compareTo(Customer that) {
        return id.compareTo(that.id);
    }
}

class Shop {

    public static Item[] getItems(){
        return new Item[] {
            new Item("cpu", "intel"),
            new Item("mouse", "logitek"),
            new Item("ddr", "samsung"),
            new Item("cpu", "amd"),
            new Item("motherboard", "intel"),
            new Item("keyboard", "logitek"),
            new Item("ssd", "samsung"),
            new Item("mouse", "microsoft"),
            new Item("monitor", "samsung")
        };
    }


    public static Collection<Customer> getCustomers(){
        var customers = new ArrayList<Customer>();
        customers.add(new Customer("Raj", 43000, 3));
        customers.add(new Customer("Tejas", 24000, 2));
        customers.add(new Customer("Pranjal", 56000, 4));
        customers.add(new Customer("Vinita", 19000, 1));
        customers.add(new Customer("Komal", 72000, 5));
        customers.add(new Customer("Shubham", 98000, 4));
        customers.add(new Customer("Manali", 45000, 3));
        customers.add(new Customer("Ankita", 66000, 2));
        customers.add(new Customer("Devendra", 120000, 5));
        return customers;
    }
    
}