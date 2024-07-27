public class Zoo {
    Animal[] animals;
    public Zoo(Animal[] animals){
        this.animals = animals;
    }
    public void printInfo(){
        for (Animal animal: animals){
            System.out.println(animal.toString());
//            if(animal instanceof Deer){
//                Deer deer = (Deer) animal;
//                System.out.println(deer.getDiets());
//            } else if (animal instanceof Tiger) {
//                Tiger tiger = (Tiger) animal;
//                System.out.println(tiger.getDiets());
//            }
            System.out.println(animal.getDiets());

        }
    }
}
