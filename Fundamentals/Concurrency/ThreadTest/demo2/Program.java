class Program {

    static class JointAccount
    {
        private int balance;

        public int balance() {
            return balance;
        }

        public boolean debit(int amount) {
            boolean result = false;
            synchronized(this){
                if(balance >= amount){
                    balance = Activity.perform(balance, amount, -1);
                    result = true;
                }
            }
            return result;
        }

        public synchronized void credit(int amount) {
            balance = Activity.perform(balance, amount, 1);
            this.notify(); 
        }

        public synchronized boolean debitAfterCredit(int amount) throws InterruptedException {
            this.wait();
            return debit(amount);
        }
    }

    public static void main(String[] args) throws Throwable {
        var acc = new JointAccount();
        acc.credit(10000);
        System.out.println("Joint account opened for Jack and Jill.");
        System.out.printf("Initial Balance: %d%n", acc.balance());
        Thread first = Thread.ofPlatform().start(() -> {
            System.out.println("Jack is withdrawing 6000...");
            if(acc.debit(6000) == false)
                System.out.println("Jack's transaction failed!");
        });
        Thread second = Thread.ofPlatform().start(() -> {
            System.out.println("Jill is withdrawing 7000...");
            if(acc.debit(7000) == false)
                System.out.println("Jill's transaction failed!");
        });
        first.join(); 
        second.join();
        System.out.printf("Final Balance: %d%n", acc.balance());
    }
}