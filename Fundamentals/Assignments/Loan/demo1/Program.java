import Bank.*;
public class Program {


    public static double getTotalEMI(Loan[] l){
        double total = 0;
        for (Loan loan : l) {
            total += loan.getEMI();
        }
        return total;
    }

    public static double getTotalTax(Loan[] l){
        double total = 0;
        for (Loan loan : l) {
            if (loan instanceof PersonalLoan) {
                total += ((PersonalLoan)loan).getTax();
            }
        }
        return total;
    }

    public static double getTotalDiscount(Loan[] l){
        double total = 0;
        for (Loan loan : l) {
            if(loan instanceof HomeLoan){
                total += ((HomeLoan)loan).getDiscount();
            }
        }
        return total;
    }

     public static void main(String[] args) {
        Loan[] loans = new Loan[4];

        loans[0] = new PersonalLoan(500000,5,300000,500000);
        loans[1] = new HomeLoan(1200000,7,1200000);
        loans[2] = new PersonalLoan(800000, 10,500000,1200000);
        loans[3] = new HomeLoan(1100000, 6, 1000000);

        for (Loan loan : loans) {
            System.out.printf("Total rate = %.2f and EMI = %.2f %n",loan.getRate(),loan.getEMI());
            System.out.println("--------");
        }

        double totalEMI = getTotalEMI(loans);
        System.out.printf("Total EMI of all loans = %.2f %n", totalEMI);

        double totalTax = getTotalTax(loans);
        System.out.printf("Total Tax of all Personal loans = %.2f %n", totalTax);

        double totalDiscount = getTotalDiscount(loans);
        System.out.printf("Total Discount of all Home loans = %.2f %n", totalDiscount);
        
     }
}