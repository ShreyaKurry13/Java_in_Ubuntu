class Program {

    private static void advise(Investment inv) {
        inv.allowRisk(inv.totalPayment() < 500000);
    }

    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        Investment s = new Investment(p, n);
        System.out.printf("Riskless investment = %.2f %n",s.futureValue());
        s.allowRisk(true);
        System.out.printf("LowRisk investment = %.2f %n",s.futureValue());
        advise(s);
        System.out.printf("Smart investment = %.2f %n", s.futureValue());
    }
    
}