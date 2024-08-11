import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Character:");
        String inputValue = input.nextLine();
        inputValue = inputValue.toLowerCase();
        char[] letters = inputValue.toCharArray();
        int[] counts = new int[26];

        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            if (Character.isLetter(letter)) {
                int index = letter - 'a';
                counts[index]++;
            }
        }
        System.out.println("Letters counts: ");
        for(int j = 0; j<counts.length; j++){
            if(counts[j] !=0){
                char letter = (char) (j + 'a');
                System.out.println(letter + ": "+ counts[j]);
            }
        }
    }
}