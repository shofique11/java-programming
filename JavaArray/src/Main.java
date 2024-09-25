//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arra1 = {30,50,60,20,10,70};
        int[] arra2;
        arra2 = new int[] {20,70,40,20,10,50};
        int arra3[] = {80,90,30};
        int[] arr = new int[]{35,55,65,25,15,75};
        System.out.println("Display arr1 element");
        for (int i =0; i<arra1.length; i++){
            System.out.print(arra1[i]+" ");
        }
        System.out.println("\nDisplay the array 2 element");
        for (int i =0; i< arra2.length; i++)
        {
            System.out.print(arra2[i]+" ");
        }
        System.out.println("\nDisplay arr3 element");
        for (int i =0; i< arra3.length; i++)
        {
            System.out.print(arra3[i]+" ");
        }
        System.out.println("\nDisplay the element array");
        for (int i =0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}