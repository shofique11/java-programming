import java.util.ArrayList;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        for (int num: numbers)
        {
            System.out.print(num+" ");
        }
        System.out.println("\n");
        numbers.add(1,100);
        for (int num: numbers)
        {
            System.out.print(num+" ");
        }
        System.out.println("\n");
        LinkedList<Integer> linkedList = new LinkedList< >();
        linkedList.add(50);
        linkedList.add(60);
        linkedList.add(70);
        for (int link: linkedList)
        {
            System.out.print(link+" ");
        }
        System.out.println("\n");
        linkedList.addFirst(101);
        linkedList.addLast(201);
        for (int link: linkedList)
        {
            System.out.print(link+" ");
        }
    }
}