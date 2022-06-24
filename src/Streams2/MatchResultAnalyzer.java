package Streams2;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatchResultAnalyzer {


    public static void main(String[] args) {
        printMatches();
        filterByTeamName("Polska");
        getNumberOfUniqueTeams();
        getNumberOfGoals();
    }

    private static void printMatches() {
        createStream().sorted((x1, x2) -> Integer.compare(x2.getNumberOfHostsGoals(), x1.getNumberOfHostsGoals()))
                .forEach(System.out::println);
    }

    static Stream<MatchResult> createStream() {
        return Stream.of(new MatchResult("Brazylia", "Francja", 0, 3),
                new MatchResult("Anglia", "Niemcy", 1, 2),
                new MatchResult("Brazylia", "Argentyna", 2, 2),
                new MatchResult("Brazylia", "Polska", 3, 1),
                new MatchResult("Włochy", "Polska", 2, 2),
                new MatchResult("Andaluzja", "Szwecja", 3, 3),
                new MatchResult("Irlandia", "Norwegia", 1, 5));
    }

    static void filterByTeamName(String teamName) {
        System.out.println("Mecze dla kraju " + teamName);
        createStream().filter((x1) -> x1.getGuestTeamName().equals(teamName) || x1.getHostTeamName().equals(teamName))
                .forEach(System.out::println);
    }

    private static void getNumberOfUniqueTeams() {
        Set<String> set = createStream().flatMap(c -> Stream.of(c.getHostTeamName(), c.getGuestTeamName()))
                .collect(Collectors.toSet());
        int numberOfTeams = set.size();
        System.out.println("Liczba unikalnych zespołów:  " + numberOfTeams);
    }

    private static void getNumberOfGoals() {
        int result = createStream().map(c -> c.getNumberOfHostsGoals() + c.getNumberOfGuestGoals()).mapToInt(Integer::intValue).sum();
        System.out.println("Liczba wszystkich bramek: " + result);
    }
}