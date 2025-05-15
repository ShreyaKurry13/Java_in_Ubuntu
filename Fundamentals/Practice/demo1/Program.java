import MET.*;

class Program {

    
    public static void main(String[] args) {
        
        Student s = new Student(10, 22, 75);
        System.out.printf(s.toString());
        System.out.printf("Passing Status = %b %n",s.isPassed());

        System.out.println("------------------");

        Student p = new Student(11, 20, 55);
        System.out.printf(p.toString());
        System.out.printf("Passing Status = %b %n",p.isPassed());
    }   
}