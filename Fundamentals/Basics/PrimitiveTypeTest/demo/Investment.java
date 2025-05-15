class Investment
{
    public static double futureValue(double installment,int years,boolean risk)
    {
        double i = risk ? 0.08 : 0.06;
        return (installment / i) * (Math.pow(1 + i, years) - 1); 
    }
}