package Enkapsulacja2;

public class Ticket {
    private String ticketPersonData;
    private String movieTitle;
    private Movie movie;
    private Client client;
    private int id;

    public Ticket(){

    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Ticket(Movie movie, Client client, int id) {
        this.movie = movie;
        this.client = client;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicketPersonData() {
        return ticketPersonData;
    }

    public void setTicketPersonData(String ticketPersonData) {
        this.ticketPersonData = ticketPersonData;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getInfo(){
        return id + " " + movie.getMovieInfo() + " " + client.getFullName();
    }
}
