package banking;

public abstract class Account {
    
    long id;
    protected double balance;

    public long id() {
        return id;
    }

    public double balance() {
        return balance;
    }

   
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws InsufficientFundsException;

    public final void freeze() {
        id = -id;
    }
}
