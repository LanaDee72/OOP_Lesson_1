import java.time.LocalDate;

public class Cat extends Animal {

    private Owner owner;

    public Cat(String name, LocalDate birthDate, Owner owner){
        super(name, birthDate);
        this.owner = owner;
    }

    public Owner getOwner(){
        return owner;
    }
    

}