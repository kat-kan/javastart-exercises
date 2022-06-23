package Streams2;

import java.util.stream.Stream;

public class MatchResultAnalyzer {
    Stream<MatchResult> results =
            Stream.of(new MatchResult("Brazylia", "Francja", 0, 3),
                    new MatchResult("Anglia", "Niemcy", 1, 2),
                    new MatchResult("Brazylia", "Argentyna", 2, 2),
                    new MatchResult("Brazylia", "Polska", 3, 1),
                    new MatchResult("Włochy", "Polska", 2, 2),
                    new MatchResult("Andaluzja", "Szwecja", 3, 3),
                    new MatchResult("Irlandia", "Norwegia", 1, 5));
}