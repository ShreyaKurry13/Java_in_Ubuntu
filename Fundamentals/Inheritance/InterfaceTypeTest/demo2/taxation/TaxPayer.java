package taxation;

public interface TaxPayer {

    double annualIncome();

    default double incomeTax(){
        double income = annualIncome();
        return income > 200000 ? 0.15 * (income - 200000) : 0;
    }
}