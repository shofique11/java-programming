//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(5.0, 6.0);
        ComplexNumber b = new ComplexNumber(-3.0, 4.0);
        System.out.println("b + a = " + a.plus(b));
        System.out.println("a - b = " + a.minus(b));
    }
}