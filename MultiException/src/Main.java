//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            int numbers[] = new int[10];
            numbers[15] = 30/0;
        }catch (ArithmeticException e){
            System.out.println("You can not divide by zero");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index you tried to access its doesnot exit");
        }
    }
}