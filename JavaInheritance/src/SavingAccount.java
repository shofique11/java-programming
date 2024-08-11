public class SavingAccount extends CheckingAccount{
    private static final int MAX_WITHDRAWAL = 5;
    private final double interestRate;
    private int withdrawalCount;

    public SavingAccount(double interestRate, String accountNumber, int initialBalance) {
        super(accountNumber,initialBalance);
        this.interestRate = interestRate;

    }
    public double calculateInterest(){
        return getBalance() * interestRate/100;
    }

    @Override
    public void withdraw(int amount) {
        if(withdrawalCount == MAX_WITHDRAWAL){
            System.out.println("Withdraw limit exceed");
        }else{
            super.withdraw(amount);
            withdrawalCount++;
        }
    }
}
