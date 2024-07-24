public class Customer {
    private String name;
    private CreditCard creditCard;
    public Customer(String name, long number, int cvc,String validThrough){
        this.name = name;
        this.creditCard = new CreditCard(number,cvc,validThrough);
    }
    public Customer(String name, CreditCard creditCard){
        this.name = name;
        this.creditCard = creditCard;
    }
}
