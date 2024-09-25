import java.util.ArrayList;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//    int[] arr1 = new int[10];
//    System.out.println(arr1[0]);
//
//    Integer[] a = new Integer[10];
//    System.out.println(a[0]);
//
//    ArrayList al = new ArrayList();
//    al.add(10);
//    al.add(20);
//    System.out.println(al);
//    al.add(30);
//    System.out.println(al);
//    al.add(true);
//    System.out.println(al);
//    al.add("Shofique");
//    System.out.println(al);
//    al.remove(2);
//    System.out.println(al);
        ArrayList arrayList = new ArrayList();
        System.out.println("boolean add(Object o) : Add an object in ArrayList");
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println("ArrayList updated is:"+ arrayList);
        System.out.println("boolean addAll(Collection c) : Add Collection in ArrayList");
        arrayList.addAll(arrayList);
        System.out.println("ArrayList updated is:"+ arrayList);
        System.out.println("boolean contains(Object o) : it returns true if element contain");
        arrayList.contains(90);
        System.out.println("Updated ArrayList is : " + arrayList);
        System.out.println("boolean containsAll(Collection c) : it returns true if collection contain");
        arrayList.containsAll(arrayList);
        System.out.println("Updated ArrayList is : " + arrayList);
        Object[] values = arrayList.toArray();
        for(int i =0; i< values.length; i++)
        {
            System.out.print(values[i]+" ");
        }

    }
}