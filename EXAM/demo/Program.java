public class Program {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item(85000, 10);
        UsedItem usItem1 = new UsedItem(75800, 8, 10);
        Item item2 = new Item(48500, 10);
        UsedItem usItem2 = new UsedItem(65000, 6, 12);
        UsedItem usItem3 = new UsedItem(68000, 9, 5);
        
        //adding items to the cart
        cart.addItem(item1);
        cart.addItem(usItem1);
        cart.addItem(item2);
        cart.addItem(usItem2);

        //displaying items of the cart
        cart.displayItems();

        //deleting a cart item
        try {
            cart.deleteItem(usItem2);
            System.out.println(usItem2.getId() + " deleted..");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        cart.displayItems();

        try {
            cart.deleteItem(usItem2);
            System.out.println(usItem2.getId() + " deleted again");
        } catch (Exception e) {
            System.out.println("Exception : "+e.getMessage());
        }

        cart.addItem(usItem3);

        System.out.println("\nTotal Number of Used Items = "+cart.totalUsedItems());
        
    }
}