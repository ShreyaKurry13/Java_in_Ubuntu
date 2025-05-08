class Program {

    private static double safeScheme(int years){
        return years < 3 ? 5.5 : 6;
    }

    public static void main(String[] args) {
        
        double p = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        var inv = new Investment(p, n);
        System.out.printf("Riskless Investment = %.2f \n",inv.futureValue(Program::safeScheme));
        System.out.printf("Riskful Investment = %.2f \n",inv.futureValue(y -> 8 + 0.25 * y));
    }
}


