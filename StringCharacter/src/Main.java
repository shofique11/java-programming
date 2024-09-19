//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String old_string = "Welcome to Java Programming";
        char added_char = 'H';
        String new_string1 = old_string + added_char;
        System.out.println("Old string: "+old_string);
        System.out.println("New string: "+new_string1);

        StringBuffer old_string1 = new StringBuffer("Python Programming");
        old_string1.insert(7,"Shofique ");
        System.out.println(old_string1);
        old_string1 = new StringBuffer("C++ Programming");
        old_string1.insert(3," Shahariar");
        System.out.println(old_string1.toString());
        String s1 = "1248.258";
        boolean str_numeric = true;
        try {
            double num1 = Double.parseDouble(s1);
        }catch (NumberFormatException e){
            str_numeric = false;
        }
        if(str_numeric){
            System.out.println(s1+ " is a number");
        }
        else {
            System.out.println(s1 + " is not a number");
        }
        String str2 = "\"Opps Java\"";
        System.out.println(str2);
    }
}