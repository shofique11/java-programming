public class Product {
    private static final int SHIPPING_RATE = 5;
    private static final double DIMENSION_CHARGE = 1.5;

    private final String name;
    private final int weight;
    private int price;

    private  final Dimension dimension;
    private int discount;

    public Product(String name, int weight, int price, int discount, Dimension dimension) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.discount = discount;
        this.dimension = dimension;
    }

    public int getPrice(){
        double price = this.price *((100 - discount)/100.00);
        price +=weight * SHIPPING_RATE;
        if(dimension.getVolume() > 10){
            price += dimension.getVolume() * DIMENSION_CHARGE;
        }
        return  (int) price;
    }
}
