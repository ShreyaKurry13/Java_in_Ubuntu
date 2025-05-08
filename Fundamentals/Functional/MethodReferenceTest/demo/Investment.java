public class Investment {
    
    private double installment;
    private int years;

    public Investment(double i,int y) {
        installment = i;
        years = y;
    }

    public double futureValue(InterestRate interest){
        double i = interest.forPeriod(years) / 100;
        return (installment * i) / (Math.pow( 1 +i, years) - 1);
    }
}
