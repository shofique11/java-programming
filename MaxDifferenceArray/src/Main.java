//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      int[] array = {
              10,
              20,
              50,
              80
      };
      int min = array[0];
      int max = array[0];
      for(int i =0; i<array.length; i++)
      {
          min = Math.min(min,array[i]);
          max = Math.max(max, array[i]);

      }
      int adbs_diff = max - min;
      System.out.println("Absolute difference of " + adbs_diff);
    }
}