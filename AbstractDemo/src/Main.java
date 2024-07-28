//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HrManager hrManager = new HrManager();
        Client client0 = new Client("Mosarof",45);
        Client client1 = new Client("Nowshid", 41);
        Client client2 = new Client("Hamim",35);
        hrManager.addClient(client0);
        hrManager.addClient(client1);
        hrManager.addClient(client2);
        double totalPay = hrManager.getTotalPay();
        System.out.println("totalPay = " + totalPay);

    }
}