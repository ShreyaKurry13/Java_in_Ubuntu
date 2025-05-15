import taxation.Supervisor;
import taxation.TaxPayer;
import taxation.Worker;

class Program {

    static class Auditor implements AutoCloseable {
        public Auditor() {
            System.out.println("Auditor - acquiring requred resources...");
        }

        public void audit(String id,TaxPayer person){
            if (id.length() < 4) 
                throw new IllegalArgumentException("Invalid ID");

            double payment = person.incomeTax() + 150;
            System.out.printf("Total Tax Payment: %.2f%n", payment);    
        }
        
        public void close() {
            System.out.println("Auditor - releasing acquired resources...");
        }
    }

    private static void doAuditing(String name, int count){
        System.out.printf("Auditing %s...%n",name);
        
        try(var a = new Auditor()) {
            if (count < 10) 
                a.audit(name, new Supervisor(count));
            else
                a.audit(name,new Worker(count));
        }
    }

    public static void main(String[] args) {
        try {
            String s = args[0].toUpperCase();
            int p = Integer.parseInt(args[1]);
            doAuditing(s, p);
        } catch (Exception e) {
            System.out.printf("Error: %s%n", e.getMessage());
        }
    }   
}
