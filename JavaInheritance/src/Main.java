//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.eat();
        cat.sleep();
        cat.makeSound();
        dog.eat();
        dog.sleep();
        dog.makeSound();

        MountainBike mountainBike = new MountainBike();
        mountainBike.setGear(5);
        System.out.println("Gear: "+ mountainBike.gear);
        mountainBike.setCadence(10);
        System.out.println("cadence: "+ mountainBike.cadence);
        mountainBike.speedUp(20);
        System.out.println("speed: "+ mountainBike.speed);
        mountainBike.applyBreak(5);
        System.out.println("speed: "+ mountainBike.speed);

        SavingAccount savingAccount = new SavingAccount(10.5,"682738",5000);
        savingAccount.deposit(200);
        System.out.println("Balance : "+ savingAccount.getBalance());
        savingAccount.withdraw(1500);
        System.out.println("Balance : "+ savingAccount.getBalance());
        savingAccount.withdraw(1000);
        System.out.println("Balance : "+ savingAccount.getBalance());
        savingAccount.withdraw(500);
        System.out.println("Balance : "+ savingAccount.getBalance());
        savingAccount.withdraw(500);
        System.out.println("Balance : "+ savingAccount.getBalance());
        savingAccount.withdraw(500);
        System.out.println("Balance : "+ savingAccount.getBalance());
        savingAccount.withdraw(500);
        System.out.println("Balance : "+ savingAccount.getBalance());
    }
}