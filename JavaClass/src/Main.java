//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        bike1.changeCadence(50);
        bike1.changeGear(4);
        bike1.sppedUp(10);
        bike1.applyBreaks(5);
        bike1.printState();

        bike2.changeCadence(80);
        bike2.changeGear(5);
        bike2.sppedUp(20);
        bike2.applyBreaks(8);
        bike2.printState();
    }
}