public class SavingAccount extends CheckingAccount{
    private final double interestRate;

    public SavingAccount(double interestRate, String accountNumber, int initialBalance) {
        super(accountNumber,initialBalance);
        this.interestRate = interestRate;

    }
}
