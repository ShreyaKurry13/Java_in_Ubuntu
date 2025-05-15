class InhousePatient extends Patient {

    private int id;
    
    public InhousePatient(int d,int b) {
        super(d,b);
        id = ++autoId;
    }

    @Override
    public double GetBill() {
        double bill = super.GetBill() - 0.10;
        return bill;
    }

    public String toString(){
        return "Patient Id = "+ id + "%n";
    }
}
