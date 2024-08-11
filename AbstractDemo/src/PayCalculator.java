public class PayCalculator {
    private static final double HOURLY_RATE = 70;

    public  double getPay(Client client) {
       return  client.getHoursWorked() * HOURLY_RATE;
    }
}
