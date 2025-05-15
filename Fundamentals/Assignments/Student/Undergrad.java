final class Undergrad extends Student {

    public Undergrad(String n, int id,int age,String ads,double g) {
        super(n,id,age,ads,g);
    }

    public String toString(){
        return "Name = " + name + ", ID = " +id+  ", Age = " +age+  ", Address = " +address+ ", Grade = " + grade+ "%n";
    }

    @Override
    public boolean isPassed() {
        if (grade > 70.0) {
            return true;
        }
        return false;
    }
}
