package Enkapsulacja2;

class CinemaSystem {
    public static void main(String[] args) {
        TicketService ticketService = new TicketService();
        Movie movie = new Movie("Omen", "horror", 128, 16, 72, 72);
        Client client1 = new Client("Jan", "Kowalski", 15);
        Ticket ticket1 = ticketService.sellTicket(client1, movie);

        Client client2 = new Client("Anna", "Zalewska", 19);
        Ticket ticket2 = ticketService.sellTicket(client2, movie);

        if(ticket1!=null){
            System.out.println(ticket1.getInfo());
        }
        if (ticket2!=null){
            System.out.println(ticket2.getInfo());
        }

        ticketService.printFreeSeatsNumber(movie);
        ticketService.printSoldTicketsNumber(movie);
    }
}
