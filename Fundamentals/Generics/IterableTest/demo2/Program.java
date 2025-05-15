import java.util.*;

public class Program {

    public static void main(String[] args) {
        
        if (args.length == 0) {
        Collection<Interval> store = new ArrayList<>();
        store.add(new Interval(5, 21));
        store.add(new Interval(4, 81));
        store.add(new Interval(6, 52));
        store.add(new Interval(7, 43));
        store.add(new Interval(3, 14));
        store.add(new Interval(2, 25));
        for (Interval i : store) {
            System.out.println(i);
        }

        }else{
            Map<String,Interval> store = new HashMap<>();
            store.put("monday", new Interval(5, 21));
            store.put("tuesday", new Interval(6, 52));
            store.put("wednesday", new Interval(7, 43));
            store.put("thursday", new Interval(3, 14));
            store.put("friday", new Interval(2, 25));
            store.put("monday", new Interval(8, 21));

            String day = args[0].toLowerCase();
            Interval val = store.get(day);
            if(val != null)
                System.out.printf("Value = %s%n", val);
            else {
                for(var entry : store.entrySet()){
                    System.out.printf("%-16s%8s%n", entry.getKey(), entry.getValue());
                }

        }
        

    }   
}
}
