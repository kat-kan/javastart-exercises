package Streams2;

import java.util.Arrays;
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

    static Stream<MatchResult> createStream() {
        return Stream.of(new MatchResult("Brazylia", "Francja", 0, 3),
                new MatchResult("Anglia", "Niemcy", 1, 2),
                new MatchResult("Brazylia", "Argentyna", 2, 2),
                new MatchResult("Brazylia", "Polska", 3, 1),
                new MatchResult("Włochy", "Polska", 2, 2),
                new MatchResult("Andaluzja", "Szwecja", 3, 3),
                new MatchResult("Irlandia", "Norwegia", 1, 5));
    }

    private static void printMatches() {
        createStream().sorted((x1, x2) -> Integer.compare(x2.getNumberOfHostsGoals(), x1.getNumberOfHostsGoals()))
                .forEach(System.out::println);
    }

    static void filterByTeamName(String teamName) {
        System.out.println("Mecze dla kraju " + teamName);
        createStream().filter((m) -> m.containsTeam(teamName))
                .forEach(System.out::println);
    }

    private static void getNumberOfUniqueTeams() {
        Set<String> set = createStream().map(MatchResult::getTeamNames)
                .flatMap(Arrays::stream)
                .collect(Collectors.toSet());
        int numberOfTeams = set.size();
        System.out.println("Liczba unikalnych zespołów:  " + numberOfTeams);
    }

    private static void getNumberOfGoals() {
        int result = createStream().map(MatchResult::getMatchGoals)
                .mapToInt(Integer::intValue).sum();
        System.out.println("Liczba wszystkich bramek: " + result);
    }
}