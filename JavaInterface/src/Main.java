//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PaymentEngine paymentEngine = new PaymentEngine();
        CashPayment cashPayment = new CashPayment(10000);
        BkashPayment bkashPayment = new BkashPayment(7000);
        paymentEngine.accept(cashPayment);
        paymentEngine.accept(bkashPayment);
    }
}