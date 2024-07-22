import java.sql.Array;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] myArray = {-45,56,89,34,-23,77};
        for(int i =0; i<myArray.length; i++){
            System.out.println(i+ "\t\t"+myArray[i]);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Length of Array");
        int sizeOfArray = input.nextInt();
        int[] numbers = new int[sizeOfArray];
        for(int j=0; j <numbers.length; j++){
            System.out.print(j + ": ");
            numbers[j] = input.nextInt();
        }
        for(int k=0; k<numbers.length; k++){
            System.out.println(k + "\t"+ numbers[k]);
        }
    }
}