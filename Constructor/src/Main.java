//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Shofique","shofique@gmail.com", 35);
        Person person2 = new Person("Khalid","khalid@yahoo.com",4);
        person2.printInfo();
        Person person3 = new Person("01727904010","Software engineering");
        person1.printInfo();
        person3.printInfo2();
        Student student1 = new Student("Inaiya",new double[] {97.45,95.75,100});
        double totalMarks = student1.totalMarks();
        double average = student1.average();
        System.out.println("Total marks: "+ totalMarks);
        System.out.println("Average: "+ average);

    }
}