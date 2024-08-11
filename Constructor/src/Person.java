public class Person {
    private String name;
    private String email;
    private int age;
    private String phone;
    private String department;
    Person(String name, String email, int age){
        this.name = name;
        this.email = email;
        this.age = age;
    }
    Person(String phone, String department){
        this.phone = phone;
        this.department = department;
    }

    public void printInfo(){
        System.out.println("Name :" + name);
        System.out.println("Email :" + email);
        System.out.println("Age :" + age);
    }
    public void printInfo2(){
        System.out.println("Phone: "+ phone);
        System.out.println("Department: "+ department);
    }
}
