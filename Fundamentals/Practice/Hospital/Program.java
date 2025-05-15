class Program {
    public static void main(String[] args) {

        Patient p = new Patient(5,1);
        System.out.printf(p.toString());
        System.out.printf("Patient's Bill = %.2f %n",p.GetBill());
        System.out.println("------------");

        InhousePatient s = new InhousePatient(5,3);
        System.out.printf(s.toString());
        System.out.printf("InHouse Patient's Bill = %.2f %n",s.GetBill());

    }

}