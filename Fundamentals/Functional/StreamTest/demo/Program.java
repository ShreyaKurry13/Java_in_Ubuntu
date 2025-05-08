import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        
        if (args[0].equals("items")) {
            var items = Shop.getItems();
            Arrays.stream(items)
                .filter(i -> i.brand().equals(args[1]))
                .map(i -> i.name())
                .forEach(System.out::println);
        }else if (args[0].equals("customers")) {
            double min = Double.parseDouble(args[1]);
            var customer = Shop.getCustomers();
            customer.stream()
                .filter(i -> i.purchase() >= min)
                .sorted()
                .forEach(c -> System.out.printf("%-12s%8s \n",c.id(),"*".repeat(c.rating())));
        }
    }
}