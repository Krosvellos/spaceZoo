import javax.xml.crypto.Data;
import java.util.List;
import java.util.Map;

public class TicketReservation {

    public void reserveTicket(){

        for (Map.Entry<String, List<Ticket>> entry : Database.tickets.entrySet()) {
            String key = entry.getKey();
            List<Ticket> value = entry.getValue();
                System.out.println("key = " + key);
                System.out.println("value = " + value);
            }
        }

    }


