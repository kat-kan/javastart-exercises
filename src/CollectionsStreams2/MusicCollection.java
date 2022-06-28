package CollectionsStreams2;

import java.util.List;
import java.util.stream.Collectors;

public class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );
        Song.Genre genre = Song.Genre.POP;
        int songsLength = getTotalSongsLengthForGenre(songs, genre);
        System.out.println("Długość piosenek z gatunku " + genre + " to " + songsLength + " sekund");

        String artist = "Metallica";
        long numberOfSongs = getNumberOfSongsForArtist(songs, artist);
        System.out.println("Liczba piosenek dla artysty " + artist + " : " + numberOfSongs);

        Song.Genre genreToBeFilteredOut = Song.Genre.POP;
        System.out.println("Lista unikalnych piosenek bez gatunku: " + genreToBeFilteredOut);
        getListOfUniqueSongsWithoutGenre(songs, genreToBeFilteredOut)
                .forEach(System.out::println);
    }

    private static int getTotalSongsLengthForGenre(List<Song> songs, Song.Genre genre) {
        return songs.stream()
                .filter(c-> c.getGenre().equals(genre))
                .mapToInt(Song::getLength)
                .sum();
    }

    private static long getNumberOfSongsForArtist(List<Song> songs, String artist) {
        return songs.stream()
                .filter(c -> c.getArtist().equals(artist))
                .count();
    }

    private static List<Song> getListOfUniqueSongsWithoutGenre(List<Song> songs, Song.Genre genreToBeFilteredOut) {
        return songs.stream()
                .filter(c -> !c.getGenre().equals(genreToBeFilteredOut))
                .distinct()
                .collect(Collectors.toList());
    }

}

