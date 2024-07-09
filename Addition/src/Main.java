//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        int sum = firstNumber + secondNumber;
        System.out.println("Sum of two numbers:"+ sum);
        int naturalSum = 0;
        int i=1, n=50;
        while(i<=n){
            naturalSum=naturalSum+i;
            i++;
        }
        System.out.println("Sum of the numbers: "+ naturalSum);
        float first = 10.4f;
        float second = 15.6f;
        float floatSum = first + second;
        System.out.println("Sum of the float number:" + floatSum);
        char ch = 'c';
        int ascii = ch;
        int castAscii = (int) ch;
        System.out.println("Ascii code of c: "+ ascii);
        System.out.println("Ascii cod by casting: "+ castAscii);
        int dividen = 25;
        int divisor = 4;
        int quotient = dividen/divisor;
        int reminder = dividen%divisor;
        System.out.println("Quotient is: "+ quotient);
        System.out.println("Reminder is:" + reminder);
        int swapNumber1 = 20;
        int swapNumber2 = 40;
        System.out.println("Before swap number1: "+swapNumber1);
        System.out.println("Before swap number2: "+swapNumber2);
        swapNumber1 = swapNumber2+swapNumber1;
        swapNumber2 = swapNumber1 - swapNumber2;
        swapNumber1 = swapNumber1 - swapNumber2;
        System.out.println("After swap number1: "+swapNumber1);
        System.out.println("After swap number2: "+swapNumber2);
        char ch2 = 'i';
        if(ch2 == 'a' || ch2== 'e' || ch2=='i' || ch2 == 'o' || ch2 == 'u'){
            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }
        int checkNumber = 29;
        int m = 2;
        boolean flag =false;
        while (m < checkNumber/2){
            if(checkNumber%m == 0){
                flag = true;
                break;
            }
            m++;
        }
        if(!flag){
            System.out.println(checkNumber+ " is prime number");
        }else{
            System.out.println(checkNumber+ " is not prime number");
        }
        int lowNumber = 20;
        int highNumber = 50;
        while ((lowNumber < highNumber)){
            if(checkPrimeNumber(lowNumber)){
                System.out.print(lowNumber+" ");
            }
            lowNumber++;
        }
    }
    public static boolean checkPrimeNumber(int primeNum) {
        boolean isprime = true;
        for(int  p= 2; p<= primeNum/2; p++){
            if(primeNum%p == 0){
                isprime = false;
                break;
            }
        }
        return isprime;
    }
}