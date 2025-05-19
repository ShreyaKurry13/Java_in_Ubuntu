//super class
public class Item {

    public static int autoId= 10;

    private int id;

    private double costPerUnit;

    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Item(double cost,int q) {
        id = ++autoId;
        costPerUnit = cost;
        quantity = q;
    }
    
    public double sellingPrice(){
        return costPerUnit * quantity;
    }
}