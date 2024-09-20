import java.util.StringJoiner;
public class Main {
    public static void main(String[] args) {
        //String Joiner as an immutable
        StringJoiner str = new StringJoiner(",","{","}");
        str.add("Java");
        str.add("C++");
        str.add("Python");
        str.add("Javascript");
        System.out.println(str);

        //Concat and + function
        String msg1 = "Welcome ";
        String msg2 = "congratulations";
        msg1 = msg1.concat(msg2);
        System.out.println(msg1);
        String txt1 = "Java ";
        String txt2 = "Programming";

        System.out.println(txt1 + txt2);
    }
}