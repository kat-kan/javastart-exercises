package CollectionsStreams2;

import java.util.Objects;

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

    @Override
    public String toString() {
        return title + " - " + artist + ", " + length + " sec, " + genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return length == song.length && Objects.equals(title, song.title) && Objects.equals(artist, song.artist) && genre == song.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length, artist, genre);
    }

    enum Genre {
        METAL,
        POP,
        ROCK,
        DANCE
    }
}
