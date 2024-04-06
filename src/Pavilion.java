import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Pavilion {

    // Creating a pavilion that includes a list of animals.
    private UUID uuid;
    private String name;
    private int capacity;

    // Setters & Getters


    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Constructor for Pavilions (name, capacity)

    public Pavilion(String name, int capacity){
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.capacity = capacity;

    }

    // Pavilion holds a list of animals

    List<Pavilion> animals = new ArrayList<>();

}
