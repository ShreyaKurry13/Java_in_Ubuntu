package banking;

import banking.Account;
import banking.InsufficientFundsException;

final class SavingAccount extends Account {
    static final double MIN_BAL = 5000;

    SavingAccount() {
        balance = MIN_BAL;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientFundsException {
        if(balance - amount < MIN_BAL)
            throw new InsufficientFundsException();
        balance -= amount;
    }
}
