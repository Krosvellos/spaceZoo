import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Animal {

    private UUID uuid;

    private String name;

    private int age;

    private LocalTime lastVeterinaryCheck;
    // Getters and Setters


    public UUID getUUID() {
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

    public void setLastTimeVeterinaryCheck(LocalTime time) {
        this.lastVeterinaryCheck = time;
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



}
