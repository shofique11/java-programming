public class CheckingAccount {
    private final String accountNumber;
    private int balance;

    public CheckingAccount(String accountNumber, int initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(int amount){
        this.balance +=amount;
        System.out.println("Depositing Amount:" + amount + " into account:"+accountNumber);
        System.out.println("New balance is :" + balance);
        System.out.println(" ");
    }
    public void withdraw(int amount){
        if(amount > balance){
            System.out.println("Insufficient balance");
        }else{
            this.balance -=amount;
            System.out.println("New Balance: "+ balance);
        }
    }
    public int getBalance(){
        return balance;
    }
}
