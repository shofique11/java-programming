public class CreditCard {
    private final long number;
    private final int cvc;
    private final String validThrough;

    public CreditCard(long number, int cvc, String validThrough) {
        this.number = number;
        this.cvc = cvc;
        this.validThrough = validThrough;
    }
}
