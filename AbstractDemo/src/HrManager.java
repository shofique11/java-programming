import java.util.ArrayList;

public class HrManager {
    private ArrayList<Client> clients = new ArrayList<>();
    private PayCalculator payCalculator = new PayCalculator();
    public void addClient(Client client){
        clients.add(client);
    }
    public double getTotalPay(){
        double total = 0.00;
        for (Client client: clients){
            total += payCalculator.getPay(client);
        }
        return total;
    }
}
