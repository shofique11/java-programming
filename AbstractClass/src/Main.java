//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Lion();
        animals[1] = new Tiger();
        animals[2] = new Snack();
        Zoo zoo = new Zoo(animals);
        zoo.printInfo();
    }
}