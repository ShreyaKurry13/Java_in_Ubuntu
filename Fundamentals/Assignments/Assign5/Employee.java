public class Employee {

    protected int hours;
    protected float rate;

    public Employee(int h, float r) {
        hours = h;
        rate = r;
    }

    public double GetNetIncome(){
        return hours * rate;
    }

    @Override
    public String toString() {
        return "Employee hours = " + hours + ", Rate = " + rate+ ", Net Income = " + GetNetIncome()+ "\n";
    }
}