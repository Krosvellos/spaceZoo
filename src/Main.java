import java.util.UUID;

public class Main {
    public static void main(String[] args) {

       Zoo zoo = new Zoo("Space Zoo");

       System.out.println("----------");
       System.out.println(zoo.getName());
        System.out.println("----------");
        zoo.createZoo();

        System.out.println("Printing from Database: ");
        System.out.println("Veterinary database: "+Database.veterinary);
        System.out.println("Animals from database: "+Database.animals);
        System.out.println("Pavilions from database: "+Database.pavilions);
    }
}