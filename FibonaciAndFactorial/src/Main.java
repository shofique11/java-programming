//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         int number = 10;
         int number2 = 10;
        int n = number;
        long factorial = 1;
        while(number > 1){
            factorial = factorial * number;
            number --;
        }
        System.out.println("Factorial of " + n +"="+ factorial);
        System.out.println(factorialCal(number2));

        //Fibonaci number series
        int fibo_lent= 9;
        for(int i = 1; i<fibo_lent; i++){
            System.out.println(fibnaciNumber(i) + " ");
        }
    }
    static int  factorialCal(int number){
        if(number !=0){
            return   number * factorialCal(number -1);
        }
        else{
            return 1;
        }
    }
    static int fibnaciNumber(int count){
            if(count == 0){
                return 0;
            }
            if(count == 1 || count == 2){
                return 1;
            }
            return fibnaciNumber(count - 1) + fibnaciNumber(count -2);
    }

}