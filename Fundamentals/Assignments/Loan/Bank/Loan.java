package Bank;

public abstract class Loan {

    protected double principle;
    protected float period;

    public Loan(double l,float p) {
        principle = l;
        period = p;
    }

    public double getPrinciple(){
        return principle;
    }

    public void setPrinciple(double value){
        principle = value;
    }

    public float getPeriod(){
        return period;
    }

    public void setPeriod(float value){
        period = value;
    }

    public abstract float getRate();

    public double getEMI(){
        float r = getRate();
        double emi = principle * (1 + r * period /100) / (12 * period);
        return emi;
    }
}