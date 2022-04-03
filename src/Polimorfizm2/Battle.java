package Polimorfizm2;

public class Battle {

    public static void main(String[] args) {
        Attacker pidgeon1 = new Attacker("Gołomp", 10, 5, 2, 5.0);
        Defender pidgeon2 = new Defender("Głupi gołomp", 2, 10, 5, 10.0);
        Defender pidgeon3 = new Defender("Paskudny gołomp", 2, 10, 3, 15.0);

        Attacker owl1 = new Attacker("Sówka", 100, 20, 50, 5.0);
        Defender owl2 = new Defender("Sóweczka", 2, 100, 55, 10.0);
        Defender owl3 = new Defender("Sówcia", 20, 100, 39, 15.0);

        Team pidgeons = new Team("Peppy Pidgeons");
        Team owls = new Team("Owling Owls");
        pidgeons.addPlayer(pidgeon1);
        pidgeons.addPlayer(pidgeon2);
        pidgeons.addPlayer(pidgeon3);
        owls.addPlayer(owl1);
        owls.addPlayer(owl2);
        owls.addPlayer(owl3);
        fight(pidgeons, owls);
    }

    public static void fight(Team first, Team second){
        int firstTeamEnergy = first.getTeamLevelOfEnergy();
        int secondTeamEnergy = second.getTeamLevelOfEnergy();
        System.out.println("Rozpoczynamy walkę. Zespół " + first.getName() + ", energia: " + firstTeamEnergy + ". Zespół " + second.getName() + ", energia: " + secondTeamEnergy);
        secondTeamEnergy = attack(first, second);
        firstTeamEnergy = attack(second, first);
        if (firstTeamEnergy > secondTeamEnergy){
            System.out.println("Drużyna " + first.getName() + " wygrywa");
        }
        else if (secondTeamEnergy > firstTeamEnergy) {
            System.out.println("Drużyna " + second.getName() + " wygrywa");
        }
        else {
            System.out.println("Remis!");
        }

    }

    public static int attack(Team first, Team second){
        System.out.println("rozpoczynamy atak zespołu:" + first.getName());
        int fightResult = second.getTeamLevelOfDefense() - first.getTeamLevelOfAttack();
        int leftEnergySecondTeam = second.getTeamLevelOfEnergy();
        if (fightResult < 0) {
            leftEnergySecondTeam -= Math.abs(fightResult);
        }
        System.out.println("Pozostało enegii po ataku: " + leftEnergySecondTeam);
        return leftEnergySecondTeam;
    }
}

