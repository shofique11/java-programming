import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Vector<Integer> v = new Vector<Integer>();
//        System.out.println("Current Capacity:" + v.capacity());
//        for (int i = 0; i < 10; ++i)
//        {
//            v.addElement(i);
//        }
//
//        for(int i =0; i<v.capacity(); i++)
//        {
//            System.out.print(v.get(i)+" ");
//        }
//        v.addElement(11);
//        System.out.println("\n Current Capacity:" + v.capacity());
//        for(int i =0; i<v.capacity(); i++)
//        {
//            System.out.print(v.get(i)+" ");
//        }

        ArrayList al = new ArrayList();

        // By using add() method to add few elements in
        // ArrayList
        al.add(10);
        al.add(10);
        al.add(20);
        al.add(20);
        al.add(30);
        System.out.print("Display ArrayList with duplicates : " + " ");
        System.out.println(al);

        HashSet hs = new HashSet();
        hs.addAll(al);
        System.out.println(al);
        al.clear();
        al.addAll(hs);
        System.out.println(al);
    }
}