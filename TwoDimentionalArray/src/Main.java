//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    int[][] array = new int[12][8];

        for(int row =0; row < array.length; row++){
            for(int column = 0; column <array[row].length; column++){
                array[row][column] = row * column + 1;
            }
        }
        for (int row =0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.printf("%3d",  array[row][column]);
            }
            System.out.println();
        }
        System.out.println("Ragged array:");
        int[][] myArray ={
                {4,5,6,8},
                {6,3,9},
                {4,12},
                {1}
        };
        for(int row = 0; row < myArray.length; row++){
            for(int column =0; column < myArray[row].length; column++){
                System.out.printf("%3d",myArray[row][column]);
            }
            System.out.println();
        }
    }
}