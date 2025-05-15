package Bank;

public class PersonalLoan extends Loan implements Tax{

    public double low;
    public double high;

    public PersonalLoan(double l,float p,double low,double high) {
        super(l,p);
        this.low = low;
        this.high = high;
    }

    @Override
    public float getRate() {
        float rate = 0.15f;
        if (principle < low) 
            rate++;
        else
            rate += 2;
        return rate;
    }

    @Override
    public double getTax() {
        return 0.10 * getEMI();
    }
}
