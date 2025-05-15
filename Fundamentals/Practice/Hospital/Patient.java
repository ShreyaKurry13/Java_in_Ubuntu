public class Patient {

    private int id;
    private int days;
    private int bedtype;

    public static int autoId = 100;

    public Patient(int d,int b)
    {
        id = ++autoId;
        days = d;
        bedtype = b;
    }

    public double GetBill() {
        return  days * getPricePerDay();
    }

    public double getPricePerDay() {
        double price;
        if(bedtype == 1){
            price =500;
        }
        else if(bedtype == 2){
            price =350;
        }
        else if(bedtype == 3){
            price =200;
        }
        else{
            price = 250;
        }
        return price;
    }

    public String toString(){
        return "Patient Id = "+ id + "%n";
    }
}
