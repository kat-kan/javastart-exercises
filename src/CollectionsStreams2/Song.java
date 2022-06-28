package CollectionsStreams2;

public class Song {
    private String title;
    private int length; //sec
    private String artist;
    private Genre genre;

    Song(String title, int length, String artist, Genre genre) {
        this.title = title;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    int getLength() {
        return length;
    }

    void setLength(int length) {
        this.length = length;
    }

    String getArtist() {
        return artist;
    }

    void setArtist(String artist) {
        this.artist = artist;
    }

    Genre getGenre() {
        return genre;
    }

    void setGenre(Genre genre) {
        this.genre = genre;
    }

    enum Genre {
        METAL,
        POP,
        ROCK,
        DANCE
    }
}
