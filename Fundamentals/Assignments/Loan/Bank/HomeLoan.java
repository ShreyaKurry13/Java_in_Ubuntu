package Bank;

public class HomeLoan extends Loan implements Discount{

    private double limit;
    public HomeLoan(double l,float p,double limit) {
        super(l,p);
        this.limit = limit;
    }

    @Override
    public float getRate() {
        float rate = 0.10f;
        if (principle > limit)
            rate += 0.01;
        return rate;
    }

    @Override
    public double getDiscount() {
        return 0.05 * getEMI();
    }
    
}