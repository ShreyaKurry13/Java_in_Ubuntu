public class Program {

    public static void main(String[] args) {
        SimpleStack<String> a = new SimpleStack<String>();
        a.push("Monday");
        a.push("Tuesday");
        a.push("Wednesday");
        a.push("Thursday");
        a.push("Friday");

        for (var i = a.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
        System.out.println("----------------");
        while (!a.empty()) {
            System.out.println(a.pop());
        }

        System.out.println("----------------");

        SimpleStack<Double> b = new SimpleStack<>();
        b.push(12.31);
        b.push(24.72);
        b.push(23.03);
        b.push(23.14);
        for (Double d : b) {
             System.out.println(d);
        } 

        System.out.println("----------------");

        while (!b.empty()) {
            System.out.println(b.pop());
        }
    }
}