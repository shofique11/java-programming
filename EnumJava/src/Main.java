//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public enum Day{
        SATURDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY,FRIDAY
    }
    public void displayDay(Day day){
        if(day == Day.FRIDAY){
            System.out.println("Its Friday weekend");
        }else{
            System.out.println("weekday");
        }
    }
    public static void main(String[] args) {
        Main enumExample = new Main();
        Day day = Day.FRIDAY;
        enumExample.displayDay(day);
        Day day2 = Day.MONDAY;
        enumExample.displayDay(day2);
    }
}