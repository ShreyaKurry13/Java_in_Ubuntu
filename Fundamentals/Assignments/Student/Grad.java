final class Grad extends Student {
    public Grad(String n, int id,int age,String ads,double g) {
        super(n,id,age,ads,g);
    }

    public String toString(){
        return "Name = " + name + ", ID = " +id+  ", Age = " +age+  ", Address = " +address+ ", Grade = " + grade+ "%n";
    }

    @Override
    public boolean isPassed() {
        if (grade > 80.0) 
            return true;
        return false;
    }
}
