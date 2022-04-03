package Exceptions2;

public class MaxCompetitorsException extends RuntimeException{
    private final int competitorsNumber;

    public MaxCompetitorsException(int competitorsNumber) {
        this.competitorsNumber = competitorsNumber;
    }

    public int getCompetitorsNumber() {
        return competitorsNumber;
    }
}
