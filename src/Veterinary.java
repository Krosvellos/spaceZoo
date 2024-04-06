import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Veterinary {
    private UUID uuid = UUID.randomUUID();
    private String nameOfClinic;

    private String vetDoctor;

    private int price;

    private String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());


    //Vytvoření Getters & Setters


    public UUID getUuid() {
        return uuid;
    }

    public String getNameOfClinic() {
        return nameOfClinic;
    }

    public void setNameOfClinic(String nameOfClinic) {
        this.nameOfClinic = nameOfClinic;
    }

    public String getVetDoctor() {
        return vetDoctor;
    }

    public void setVetDoctor(String vetDoctor) {
        this.vetDoctor = vetDoctor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    // Constructor

    public Veterinary(String nameOfClinic, String vetDoctor){
        this.uuid = UUID.randomUUID();
        this.nameOfClinic = nameOfClinic;
        this.vetDoctor = vetDoctor;

    }




}
