public abstract class Student {
    public String name;
    public int id;
    public int age;
    public String address;
    public double grade;

    public Student(String n, int sid,int sage,String ads,double g) {
        name = n;
        id = sid;
        age = sage;
        address = ads;
        grade = g;
    }

    public abstract boolean isPassed();

    public String toString(){
        return "Name = " + name + ", ID = " +id+  ", Age = " +age+  ", Address = " +address+ ", Grade = " + grade+ "%n";
    }
}
