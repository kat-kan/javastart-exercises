package Object1;

public class DataStore {
    private static final int MAX_NUMBER_OF_COMPUTERS = 100;
    private Computer[] computers = new Computer[MAX_NUMBER_OF_COMPUTERS];
    private int computerCount;

    public void add(Computer computer){
        if (computerCount < MAX_NUMBER_OF_COMPUTERS){
            computers[computerCount] = computer;
            computerCount++;
        }
        else {
            System.out.println("magazyn pełny");
        }
    }

    public String getInfoAboutStore(){
        String info = "Lista: " + "\n";
        for (Computer computer: computers
             ) {
            if(computer!=null){
                info += computer + "\n";
            }
        }
        return info;
    }

    public int checkAvailability(Computer computer){
        int numberOfComputersWithTHeSameParams = 0;
        for (Computer comp: computers
             ) {
            if (comp!=null)
            {
            if(comp.equals(computer)){
                numberOfComputersWithTHeSameParams++;
            }}
        }
        return numberOfComputersWithTHeSameParams;

    }


}
