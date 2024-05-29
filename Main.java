import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        Cat barsik = new Cat("Барсик", LocalDate.of(1999, 3, 21), new Owner());    // Новый экземпляр класса

        Animal animal1 = new Animal("Animal-1", LocalDate.now());

        System.out.println(barsik.getBirthDate());
        
        barsik.setName("Tom");

        System.out.println(barsik);

        Dog dog1 = new Dog("Dog1", LocalDate.of(1999, 10, 3));

        System.out.println(dog1.getType());

        Animal animalDog = new Dog("Dog2", LocalDate.now());

        List<Animal> animals = List.of(animal1, animalDog, barsik);

        System.out.println(animals);


        Cat animalCat = new Cat("Cat1", LocalDate.now(), new Owner());
        System.out.println(animalCat.getOwner());


        
    }
}
