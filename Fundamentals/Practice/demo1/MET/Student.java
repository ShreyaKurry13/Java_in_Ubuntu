package MET;

public class Student {
    private int rollNo;
    private int age;
    private double Grade;

    public Student(int r, int a, double g) {
        rollNo = r;
        age = a;
        Grade = g;
    }

    public int getRollNo(){
        return rollNo;
    }

    public void setRollNo(int value){
        rollNo = value;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int value){
        age = value;
    }

    public double getGrade(){
        return Grade;
    }

    public void setGrade(int value){
        Grade = value;
    }

    public String toString(){
        return "Roll No = " + rollNo + " , " +"Age = " + age + " , " +"Grade = " + Grade + "%n";
    }

    public boolean isPassed(){
        if (Grade > 60) {
            return true;
        }
        return false;
    }
}
