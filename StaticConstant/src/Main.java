//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Circle circle1 = new Circle(15);
            Circle circle2 = new Circle(12);
            Circle circle3 = new Circle(8);
            System.out.println("Circle1 area is: "+ circle1.getArea());
            System.out.println("Circle2 area is: "+ circle2.getArea());
            System.out.println("Circle3 area is: "+ circle3.getArea());
            System.out.println("Number of object: "+ circle3.getNumberOfObjectCreated());
            Circle result = new Circle(15,12);
           // Circle result2 = new Circle(20,18);
            System.out.println("My number calculation result: " + result.getResult());
            //System.out.println("My number calculation result: " + result.getResult2());
    }
}