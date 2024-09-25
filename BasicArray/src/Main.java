import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int c =0; int k;
        System.out.println("How many element you want to add ?");
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] array = new int[len];
        System.out.println("Enter the element");
        for(int i=0; i < len; i++)
        {
            array[i] = sc.nextInt();
        }

        int temp =0;
        for(int m = 0; m<len; m++)
        {
            for(int n= m+1; n <len; n++)
            {
                if(array[m] > array[n])
                {
                    temp = array[m];
                    array[m] = array[n];
                    array[n] = temp;
                }
            }
        }
        System.out.println("Shorting you enter element");
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("\nThe largest element "+ array[len-1]);

        System.out.println("Enter the search number");
        int g = sc.nextInt();
        for(int p =0; p<len; p++)
        {
            if(array[p] == g){
                k = p+1;
                System.out.println("Element found at " + k + "th " + "position");
                c = 1;
                break;
            }
        }
        if(c ==0)
        {
            System.out.println("Your searching number not found.");
        }

    }
}