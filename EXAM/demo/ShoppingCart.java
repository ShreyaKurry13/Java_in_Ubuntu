import java.util.ArrayList;
import java.util.Collection;

public class ShoppingCart {
    Collection<Item> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addItem(Item item){
        cartItems.add(item);
    }

    public void deleteItem(Item id) throws Exception{
        boolean removed = cartItems.removeIf(i -> i.getId().equals(id));
            
        } catch (Exception e) {
                throw new RuntimeException("Selected item " + item.getId() + " is not there in the cart");
        }
    }

    public double cartPrice(){
        double total = 0;
        for (Item i : cartItems) {
            total += i.sellingPrice();
        }

        if (total > 100000) {
            total = total - (total *0.10);
        }
        else{
            total = total - (total * 0.05);
        }

        return total;
    }

    public int totalUsedItems(){
        int count = 0;
       for (Item item : cartItems) {
        if(item instanceof UsedItem){
            count++;
        }
       }
        return count;
    }

    public void displayItems(){
        System.out.println("Displaying Cart Items...");
        for (Item item : cartItems) {
            System.out.println("ID = " +item.getId() + " Cost = "+item.sellingPrice());
        }
    }

}
