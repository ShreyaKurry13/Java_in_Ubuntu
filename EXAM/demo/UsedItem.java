//subclass
public class UsedItem extends Item{
    
    private double discountPercentage;

    public double getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public UsedItem(double cost,int q,double dis) {
        super(cost , q);
    }

    @Override
    public double sellingPrice() {
        double og = super.sellingPrice();
        return og - (og * discountPercentage);
    }
}
