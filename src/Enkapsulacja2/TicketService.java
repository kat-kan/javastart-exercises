package Enkapsulacja2;

public class TicketService {

    public Ticket sellTicket(Client client, Movie movie) {
        Ticket ticket = validateIfTicketCanBeSold(movie, client);
        if (ticket!=null){
            ticket.setId(setTicketId(movie));
            ticket.setClient(client);
            ticket.setMovie(movie);
            movie.setFreeSeats(movie.getFreeSeats() - 1);
        }
        return ticket;
    }


    private Ticket validateIfTicketCanBeSold(Movie movie, Client client) {
        if (movie.getFreeSeats() == 0) { //to można by wydzielić do osobnej metody
            System.out.println("Brak wolnych miejsc na seans");
            return null;
        } else if (client.getAge() < movie.getAgeRequired()) { //to można by wydzielić do osobnej metody
            System.out.println("Film dostępny dla osób powyżej " + movie.getAgeRequired() + " lat");
            return null;
        } else
        return new Ticket();
    }

    private int setTicketId(Movie movie){
        return movie.getMaxSeats() - movie.getFreeSeats() + 1;
    }

    public void printSoldTicketsNumber(Movie movie) {
        System.out.println("Liczba sprzedanych biletów: " + (movie.getMaxSeats() - movie.getFreeSeats()));
    }

    public void printFreeSeatsNumber(Movie movie) {
        System.out.println("Liczba pozostałych miejsc: " + movie.getFreeSeats());
    }
}
