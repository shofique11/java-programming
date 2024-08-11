//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(3,5,4);
        Dimension dimension1 = new Dimension(2,4,3);
        Dimension dimension2 = new Dimension(3,3,2);
        Product box = new Product("Hp laptop",2,500,50, dimension);
        Product box1 = new Product("Accer laptop",3,600,40, dimension1);
        Product box2 = new Product("Dell laptop",4,700,60, dimension2);
        System.out.println("Product volume : "+ dimension.getVolume());
        System.out.println("Total price : "+ box.getPrice());
        System.out.println("Product volume : "+ dimension1.getVolume());
        System.out.println("Total price : "+ box1.getPrice());
        System.out.println("Product volume : "+ dimension2.getVolume());
        System.out.println("Total price : "+ box2.getPrice());
    }
}