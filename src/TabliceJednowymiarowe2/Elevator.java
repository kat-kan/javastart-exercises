package TabliceJednowymiarowe2;

public class Elevator {
    private Person[] people = new Person[4];
    private final int maxWeight = 400;

    public void add(Person person) {
        if (this.people[0] == null) {
            people[0] = person;
        } else if (this.people[1] == null) {
            people[1] = person;
        } else if (this.people[2] == null) {
            people[2] = person;
        } else if (this.people[3] == null) {
            people[3] = person;
        } else {
            System.out.println("No space left for the 5th person");
        }


    }

    public void start() {
        int totalWeight = getTotalWeight();
        if (totalWeight <= maxWeight) {
            System.out.println("Elevator started");
        } else {
            int overload = totalWeight - maxWeight;
            System.out.println("Elevator overloaded " + overload + " kg too much");
        }
    }

    private int getTotalWeight() {
        int totalWeight = 0;
        for (int i = 0; i < 4; i++) {
            if (this.people[i] != null) {
                totalWeight += this.people[i].getWeight();
            }

        }
        return totalWeight;
    }

    public void clear() {
        for (int i = 0; i < 4; i++) {
            this.people[i] = null;
        }
        System.out.println("Elevator empty");
    }
}
