//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b =0;
        int result = 0;
        try {
             result = divide(a,b);
        }catch (ArithmeticException e){
            System.out.println("You can not divide by 0");
        }
        System.out.println("result= "+ result);
    }
    private static int divide(int a, int b){
        return a/b;
    }
}