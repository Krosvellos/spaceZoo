import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;

public class Zoo {
    public String name;
    private ArrayList<UUID> pavilionUUIDs = new ArrayList<>();



    public void addPavilion(Pavilion pavilion) {
        UUID uuid = UUID.randomUUID();
        pavilionUUIDs.add(uuid);
        Database.pavilionHashMap.put(uuid, pavilion);
    }




//    public Veterinary getVeterinary(String nameOfVeterinary) {
////        for (UUID uuid : veterinaryUUIDs) {
////            Database.veterinaryHashMap.forEach((key,value) -> {
////                if (value.getNameOfVeterinary().equals(nameOfVeterinary) && key == uuid) {
////                    return value;
////                }
////            });
////        }
//        for (Map.Entry<UUID, Veterinary> entry : Database.veterinaryHashMap.entrySet()) {
//            Veterinary veterinary = entry.getValue();
//            if (veterinary != null && veterinary.getNameOfVeterinary().equals(nameOfVeterinary)) {
//                //System.out.println(veterinary);
//                return veterinary;
//            }
//        }
//        return null;
//    }

    public void listPavilions() {
        System.out.println();
        System.out.println();
        System.out.println("Pavilons in - " + name + " - Zoo");
        System.out.println("------------------------");

        for (UUID element : pavilionUUIDs) {
            Database.pavilionHashMap.forEach((key, value) -> {
                if (element == key) {
                    System.out.println(value.getNameOfPavilion());
                }
            });
        }
        System.out.println("------------------------");
        System.out.println();
    }

    public void AddAnimalToPavilion(String nameOfPavilon, Animal animal) {
        Database.pavilionHashMap.forEach((key, value) -> {
            if (value.getNameOfPavilion().equals(nameOfPavilon)) {
                value.addAnimalToPavilion(animal);
            }
        });
    }




    public Animal getAnimal(String nameOfPavilon, String nameOfAnimal) {
        for (Map.Entry<UUID, Pavilion> entry : Database.pavilionHashMap.entrySet()) {
            Pavilion pavilion = entry.getValue();
            if (nameOfPavilon.equals(pavilion.getNameOfPavilion())) {
                Animal animal = pavilion.getAnimal(nameOfAnimal);
                if (animal != null) {
                    return animal;
                }
            }
        }
        return null;
    }

//    public UUID getAnimal(String nameOfPavilon, String nameOfAnimal) {
//
//        Database.pavilonHashMap.forEach((key, value) -> {
//            if (nameOfPavilon.equals(value.getNameOfPavilon())) {
//                value.getAnimal(nameOfAnimal);
//
//            }
//        });
//        return null;
//    }


//    public void veterinaryCare(String nameOfVeterinaryCare, UUID animalUUID) {
//        Database.veterinaryHashMap.forEach((key, value) -> {
//            if (value.getNameOfVeterinary().equals(nameOfVeterinaryCare)) {
//                value.addAnimalToVeterinaryAndWriteNote(animalUUID);
//            }
//        });
//    }

    public void listAnimalsFromPavilion(String name) {
        System.out.println();
        System.out.println();
        System.out.println("Animals in - " + name + " - Pavilon");
        System.out.println("------------------------");
        Database.pavilionHashMap.forEach((key, value) -> {
            if (name.equals(value.getNameOfPavilion())) {
                value.listAnimalsInPavilion();
            }
        });
        System.out.println("------------------------");
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public Zoo(String name) {
        this.name = name;
    }
}