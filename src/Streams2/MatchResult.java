package Streams2;

public class MatchResult {

    private String hostTeamName;
    private String guestTeamName;
    private int numberOfHostsGoals;
    private int numberOfGuestGoals;

    public MatchResult(String hostTeamName, String guestTeamName, int numberOfHostsGoals, int numberOfGuestGoals) {
        this.hostTeamName = hostTeamName;
        this.guestTeamName = guestTeamName;
        this.numberOfHostsGoals = numberOfHostsGoals;
        this.numberOfGuestGoals = numberOfGuestGoals;
    }

    public String getHostTeamName() {
        return hostTeamName;
    }

    public void setHostTeamName(String hostTeamName) {
        this.hostTeamName = hostTeamName;
    }

    public String getGuestTeamName() {
        return guestTeamName;
    }

    public void setGuestTeamName(String guestTeamName) {
        this.guestTeamName = guestTeamName;
    }

    public int getNumberOfHostsGoals() {
        return numberOfHostsGoals;
    }

    public void setNumberOfHostsGoals(int numberOfHostsGoals) {
        this.numberOfHostsGoals = numberOfHostsGoals;
    }

    public int getNumberOfGuestGoals() {
        return numberOfGuestGoals;
    }

    public void setNumberOfGuestGoals(int numberOfGuestGoals) {
        this.numberOfGuestGoals = numberOfGuestGoals;
    }
}
