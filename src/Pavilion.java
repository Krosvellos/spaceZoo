import java.util.ArrayList;

import java.util.UUID;

public class Pavilion {

    // Creating a pavilion that includes a list of animals.

    private String name;
    private int capacity;
    private ArrayList<UUID> animalUUIDs = new ArrayList<>();


    public void addAnimalToPavilion(Animal animal) {
        UUID uuid = UUID.randomUUID();
        animalUUIDs.add(uuid);
        Database.animalHashMap.put(uuid, animal);
    }

    public String getNameOfPavilion() {
        return name;
    }

    public void listAnimalsInPavilion() {
        for (UUID element : animalUUIDs) {
            Database.animalHashMap.forEach((key, value) -> {
                if (element == key) {
                    System.out.println(value.getName());
                }
            });
        }
    }

    public UUID getAnimalUUID(String nameOfAnimal) {
        for (UUID element : animalUUIDs) {
            Animal animal = Database.animalHashMap.get(element);
            if (animal != null && nameOfAnimal.equals(animal.getName())) {
                return animal.getUUID();
            }
        }
        return null;
    }
    public Animal getAnimal(String nameOfAnimal) {
        for (UUID element : animalUUIDs) {
            Animal animal = Database.animalHashMap.get(element);
            if (animal != null && nameOfAnimal.equals(animal.getName())) {
                return animal;
            }
        }
        return null;
    }

    public Pavilion(String name) {
        this.name = name;

        // Pavilion holds a list of animals

    }

}
