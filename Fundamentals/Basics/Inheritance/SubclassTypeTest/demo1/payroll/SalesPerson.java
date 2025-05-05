package payroll;

 public class SalesPerson extends Employee{
    private double sales;

    public SalesPerson(int h,float r,double s){
        super(h, r);
        sales = s;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double value) {
        sales = value;
    }

    public double income(){
        double amount = super.income();
        if (sales > 25000) 
            amount += 0.5 * sales;
        return amount;
    }
 }