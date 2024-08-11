public class DogWalker {
    public void walk(Dog dog){
        if(dog instanceof Poddle){
            Poddle poodle = (Poddle) dog;
            System.out.println("Walking "+poodle.getName());
        }
        System.out.println("Walking "+dog.getBread());

    }
}
