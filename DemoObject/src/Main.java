//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Product keyboard = new Product("Mechanical gaming keyboard", 48);
        Product mouse = new Product("Gaming Mouse", 50);
        Product ecoDot = new Product("Eco dot 4th generation", 30);
        shoppingCart.addProduct(keyboard);
        shoppingCart.addProduct(mouse);
        shoppingCart.addProduct(ecoDot);

        System.out.println("ShoppingCart = " + shoppingCart);
        int totalPrice = shoppingCart.getTotalPrice();
        System.out.println("totalPrice = "+ totalPrice);
    }
}