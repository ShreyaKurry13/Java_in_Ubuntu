public class SalesPerson extends Employee{
    
    private int sales;

    public SalesPerson(int h,float r, int s) {
        super(h,r);
        sales = s;
    }

    @Override
    public double GetNetIncome() {
        return super.GetNetIncome() + sales;
    }

    @Override
    public String toString() {
        return "SalesPerson hours = " + hours + ", Rate = " + rate+ "Net Income = " + GetNetIncome()+ "%n";
    }
}
