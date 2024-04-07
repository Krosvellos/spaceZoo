import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {

    // A ticket should have a uuid and a boolean validity value. Also a date of creation.

    private UUID uuid;

    private boolean validity;

    private LocalDateTime timeOfCreation;

    // Getters & setters


    public UUID getUuid() {
        return uuid;
    }

    public LocalDateTime getTimeOfCreation() {
        return timeOfCreation;
    }

    public boolean isValidity() {
        return validity;
    }

    public void setValidity(boolean validity) {
        this.validity = validity;
    }

    // Constructor

    public Ticket(boolean validity){
        this.uuid = UUID.randomUUID();
        this.validity = validity;
        this.timeOfCreation = LocalDateTime.now();
    }

}
