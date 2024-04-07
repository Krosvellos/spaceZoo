import java.util.ArrayList;
import java.util.List;

public class TicketCreator {

    public void createTicket(){

        // Adding tickets to the zoo. First we create a list of tickets.

        List<Ticket> ticketList = new ArrayList<>();

        Ticket ticket1 = new Ticket(true);
        Ticket ticket2 = new Ticket(true);

        ticketList.add(ticket1);
        ticketList.add(ticket2);

        Database.tickets.put("Tickets", ticketList);

    }

}
