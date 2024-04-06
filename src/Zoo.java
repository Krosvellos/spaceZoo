import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Zoo {

    private UUID uuid;
    private String name;

    // Getter & Setter for name of the Zoo
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Creating a new zoo that includes a list of pavilions.

    // Constructor
    public Zoo(String name){
        this.uuid=UUID.randomUUID();
        this.name= name;
    }

    // a method to create a zoo
    public void createZoo(){

        // Creating a list of pavilions
        List<Pavilion> pavilions = new ArrayList<>();

        // Creating new pavilions

        Pavilion pavilion1 = new Pavilion("Alpha",20);
        Pavilion pavilion2 = new Pavilion("Beta",15);

        //Adding pavilions to the list

        pavilions.add(pavilion1);
        pavilions.add(pavilion2);
        System.out.println(pavilions);
        Database.pavilions.put("Pavilions", pavilions);

        // Creating instances of animals - I know the comments are getting tedious n stuff

        Animal spaceWhale = new Animal("Irma", 32);
        Animal spaceCow = new Animal("Ivette", 8);
        Animal spaceLion = new Animal("Bob", 5);

        pavilion1.animalsList.add(spaceWhale);
        pavilion1.animalsList.add(spaceCow);
        pavilion2.animalsList.add(spaceLion);

        System.out.println(pavilion1.animalsList);
        System.out.println(pavilion2.animalsList);

        Database.animals.put("Pav1Animals", pavilion1.animalsList);
        Database.animals.put("Pav2Animals", pavilion2.animalsList);






    // -- Veterinary init
        Veterinary vet1 = new Veterinary("Space clinic","Doctor Lu");
        System.out.println("----------------");
        System.out.println(vet1.getUuid());
        System.out.println(vet1.getVetDoctor());
        System.out.println(vet1.getNameOfClinic());
        System.out.println("----------------");
        spaceWhale.veterinaryList.add(vet1);
        Database.veterinary.put("whaleVet", spaceWhale.veterinaryList);







    }


}
