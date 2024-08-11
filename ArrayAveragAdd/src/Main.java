import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Length of Array iput");
        int sizeOfArray = input.nextInt();
        int[] myNumbers = new int[sizeOfArray];
        for(int i=0; i <myNumbers.length; i++){
            System.out.print(i + ": ");
            myNumbers[i] = input.nextInt();
        }
        int sum = 0;
        for (int myNumber : myNumbers) {
            sum += myNumber;
        }
        System.out.println("Sum of numbers:" + sum);
        double average = (double) sum/myNumbers.length;
        System.out.println("Average of numbers:"+ average);

        int min = myNumbers[0];
        int max = myNumbers[0];
        for(int j =1; j<myNumbers.length; j++){
            if( myNumbers[j] < min){
                min = myNumbers[j];
            }
            if(myNumbers[j] > max){
                max = myNumbers[j];
            }
        }
        System.out.println("Minimum number:" + min);
        System.out.println("Maximum number:" + max);

    }
}