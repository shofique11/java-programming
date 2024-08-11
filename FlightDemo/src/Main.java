//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.addOnePassenger();
        flight.addOnePassenger(1);
        flight.addOnePassenger(1,1);
        int totalCheckedBags = flight.getTotalCheckedBags();
        System.out.println("Total Checked bags: " + totalCheckedBags);
        int totalPassengers = flight.getTotalPassengers();
        System.out.println("Total passenger: " + totalPassengers);
    }
}