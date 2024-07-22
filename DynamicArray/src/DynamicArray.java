import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DynamicArray {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a sequence of integer: ");
        int capacity = 5;
        int size = 0;
        int[] elements = new int[capacity];
        int nextInt;
        while (true){
            nextInt = input.nextInt();
            if(nextInt == -1){
                System.out.println("We are done taking inputs!");
                break;
            }
            if(elements.length == size){
                int newCapacity = elements.length * 2;
                elements = Arrays.copyOf(elements,newCapacity);
            }
            elements[size] = nextInt;
            size++;
        }
        if(elements.length > size){
            elements = Arrays.copyOfRange(elements,0,size);
        }
        System.out.println("You entered:");
        System.out.println(Arrays.toString(elements));

    }
}