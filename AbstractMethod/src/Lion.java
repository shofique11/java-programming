public class Lion extends Animal{
    public Lion(){
        super(4, "The Lion");
    }

    @Override
    public String getDiets() {
        return "Meat and grass";
    }
}
