//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n= 12;
        int m=6;
       for(int i = 1; i <= n; i++){
           System.out.print("*");
           if( i == 1 || i == n){
               for(int j = 1; j<=m; j++){
                   System.out.print("*");
               }
           }else {
               System.out.println();

               for(int k =1; k<m-1; k++){
                   System.out.print("");
               }
               System.out.print("*");

           }
       }
    }
}