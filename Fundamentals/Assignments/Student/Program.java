public class Program {

    public static void main(String[] args) {
        Student s1 = new Undergrad("Shreya", 10, 22, "Mumbai", 75);
        System.out.printf(s1.toString());
        System.out.printf("Passing Status = %b %n",s1.isPassed());

        System.out.printf("--------------------------%n");

        Student s2 = new Grad("Shubra", 11, 20, "Pune", 60);
        System.out.printf(s2.toString());
        System.out.printf("Passing Status = %b %n",s2.isPassed());

        System.out.printf("------------------------------%n");

        Student s3 = new Undergrad("abc", 13, 16, "nyc", 60);
        System.out.printf(s3.toString());
        System.out.printf("Passing Status = %b %n",s3.isPassed());

        System.out.printf("------------------------------%n");

        Student s4 = new Grad("pqr", 14, 21, "UK", 50);
        System.out.printf(s4.toString());
        System.out.printf("Passing Status = %b %n",s4.isPassed());
    }
}