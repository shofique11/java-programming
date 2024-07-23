public class Circle {
    private int redius;
    private static final double PI = 3.1416;
    private static int numberOfObjectCreated = 0;
    private int number1;
    private static int number2 = 10;
    public Circle(int redius){
        this.redius = redius;
        numberOfObjectCreated++;

    }
    public Circle(int number1, int number2){
        this.number1 = number1;
    }
    public double getArea(){
        return redius * PI;
    }
    public int getNumberOfObjectCreated(){
        return numberOfObjectCreated;
    }
    public int getResult(){
        return number1 - number2;
    }
//    public static  int getResult2(){
//        return number1 - number2;
//    }
}
