import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    // Creating a new zoo that includes a list of pavilions.

    // a method to create a zoo
    public void createZoo(){

        // Creating a list of pavilions
        List<Pavilion> pavilions = new ArrayList<>();
        Pavilion pavilion1 = new Pavilion("Alpha",20);
        Pavilion pavilion2 = new Pavilion("Beta",15);

        pavilions.add(pavilion1);
        pavilions.add(pavilion2);
        System.out.println(pavilions);


    // -- Veterinary init
//        Veterinary vet = new Veterinary("Space clinic","Doctor Lu");
//        System.out.println(vet.getVetDoctor());
//        System.out.println(vet.getNameOfClinic());
//        vet.setNameOfClinic("Moon Clinic");
//        System.out.println("----------------");
//        System.out.println(vet.getNameOfClinic());
//
//        System.out.println(vet.getUuid());



    }


}
