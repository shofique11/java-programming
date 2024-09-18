//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java programming");
        System.out.println("Hello java string");
        String s1 = "Hello Java Programming";
        String s2 = "Hello java programming";
        String s3 = "  Hi sweet heart  ";
        System.out.println("check equals string: "+s1.equals(s2));
        System.out.println("check equals string ignore case: "+s1.equalsIgnoreCase(s2));
        System.out.println("String length: "+s1.length());
        System.out.println("character of index: "+s1.charAt(0));
        System.out.println("character of index: "+ s1.charAt(12));
        System.out.println("Substring word: "+s1.indexOf("Programming"));
        System.out.println("Substring word: "+s1.indexOf("World"));
        System.out.println("Substring: "+s1.substring(6,12));
        System.out.println("Compare: "+s1.compareTo(s2));
        System.out.println("Make uppercase: "+ s2.toUpperCase());
        System.out.println("Make lowercase: "+ s2.toLowerCase());
        System.out.println("trim string: "+ s3.trim());
    }
}