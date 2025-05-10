package app;

import java.lang.reflect.Method;

import finance.Loans;

public class Program {
    public static void main(String[] args) throws Throwable{
        double p = Double.parseDouble(args[0]);
        Class<?> c = Class.forName("finance."+ args[1]);
        Object policy = c.getConstructor().newInstance();
        Method scheme = c.getMethod(args[2],double.class,int.class);
        int m = 10;

        for(int n=1; n <=m; ++n){
            double r = (double)scheme.invoke(policy,p,n);
            double emi = Loans.monthlyInstallment(p, n, r);
            System.out.printf("%d\t%.2f%n", n, emi);
        }
    }
}
 