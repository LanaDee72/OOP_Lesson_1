import java.time.LocalDate;

public class Animal {
    
    protected String name;           // Поля класса. Отвечают за состояние объекта
    protected LocalDate brirthDate;

// Методы клааса отвечают за поведение класса

    public Animal(String name, LocalDate birthDate){
        this.name = name;
        this.brirthDate = birthDate;
    }

    public String getName(){
        return name;
    }

    public LocalDate getBirthDate(){
        return brirthDate;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    @Override
    public String toString() {
        return "Animal" + " - " + name + ", " + "birthDate" + " - " + brirthDate;
    }

}


