public class Main {
    public static void main(String[] args) {

        Veterinary vet = new Veterinary("Space clinic","Doctor Lu");
       System.out.println(vet.getVetDoctor());
       System.out.println(vet.getNameOfClinic());
        vet.setNameOfClinic("Moon Clinic");
        System.out.println("----------------");
        System.out.println(vet.getNameOfClinic());

    }
}