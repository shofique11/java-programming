public class DrawingPad {
    public void drawing(Shape shape){
        String actualType = shape.getClass().getTypeName();
        System.out.println("Actual Type: "+actualType);
        System.out.println("Drawing " + shape.getName());
    }
}
