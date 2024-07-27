//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       DrawingPad drawingPad = new DrawingPad();
       Circle circle = new Circle();
       Square square = new Square();
       drawingPad.drawing(circle);
       drawingPad.drawing(square);
       Dog dog1 = new Dog();
       Dog dog2 = new Poddle();
       Dog dog3 = new Bulldog();
       DogWalker dogWalker = new DogWalker();
       dogWalker.walk(dog1);
       dogWalker.walk(dog2);
       dogWalker.walk(dog3);

    }
}