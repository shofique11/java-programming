public abstract class Animal {
    private final int legs;
    private String name;

    public Animal(int legs, String name) {
        this.legs = legs;
        this.name = name;
    }

    public String toString(){
        return (name + " has "+ legs + " legs");
    }
    public abstract String getDiets();
}
