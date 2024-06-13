package basic.access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Item item1 = new Item("상추", 1000, 2);
        Item item2 = new Item("배추", 2000, 2);
        Item item3 = new Item("고추", 3000, 2);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.displayItems();
    }
}
