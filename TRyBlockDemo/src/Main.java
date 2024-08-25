import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        String text = "Lorem ipsum dolor sit amet.";
//        try{
//            System.out.println("Entered on try block");
//            Files.WriteString(Path.of("file.txt"), text, StandardOpenOption.WRITE);
//        }catch (IOException e){
//            System.out.println("Entered on catch block");
//            e.printStackTrace();
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number=0;
        do{
            try {
                number = input.nextInt();
                if(number != -1){
                    System.out.println("You entered: "+ number +", enter another number (-1 exit):");
                }else{
                    System.out.println("Program exited");
                }
            }catch (InputMismatchException e){
                e.printStackTrace();
                System.out.println("Please enter only a number");
                input.nextLine();
            }

        }while (number != -1);
    }
}