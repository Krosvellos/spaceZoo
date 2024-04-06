import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Animal {

    private UUID uuid;

    private String name;

    private int age;

    // Getters and Setters


    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Constructor for Animal (name, age)
    public Animal(String name, int age){
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.age = age;


    }

    List<Veterinary> veterinaryList = new ArrayList<>();

}
