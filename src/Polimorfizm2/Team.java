package Polimorfizm2;

public class Team {
    public static final int MAX_NUMBER_OF_PLAYERS = 3;

    private Character[] players = new Character[MAX_NUMBER_OF_PLAYERS];
    private String name;
    private int numberOfPlayers = 0;

    public void addPlayer(Character player){
        if (numberOfPlayers < MAX_NUMBER_OF_PLAYERS){
            players[numberOfPlayers] = player;
            numberOfPlayers ++;
        }
        else {
            System.out.println("Drużyna jest pełna");
        }
    }

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeamLevelOfEnergy(){
        int teamLevelOfEnergy = 0;
        for (Character player: players
             ) {
            teamLevelOfEnergy += player.getEnergyLevel();
        }
        return teamLevelOfEnergy;
    }

    public int getTeamLevelOfAttack(){
        int teamLevelOfAttack = 0;
        for (Character player: players
        ) {
            teamLevelOfAttack += player.getPowerOfAttack();
        }
        return teamLevelOfAttack;
    }

    public int getTeamLevelOfDefense(){
        int teamLevelOfDefense = 0;
        for (Character player: players
        ) {
            teamLevelOfDefense += player.getPowerOfDefense();
        }
        return teamLevelOfDefense;
    }
}
