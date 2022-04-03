package Statyczne3;

public class Car {
    private double fuelLevel;
    private boolean isEngineFine;
    private boolean isFuelFillerFlapClosed;
    private boolean areDoorsClosed;
    private boolean isEngineStarted;

    private final static int CAR_STARTED = 100;
    private final static int ENGINE_BROKEN = 200;
    private final static int NO_FUEL = 300;
    private final static int CAR_STARTED_WITH_OPEN_FUEL_FILLER_FLAP = 400;
    private final static int CAR_STARTED_WITH_DOORS_OPENED = 500;

    public Car(double fuelLevel, boolean isEngineFine, boolean isFuelFillerFlapClosed, boolean areDoorsClosed, boolean isEngineStarted) {
        this.fuelLevel = fuelLevel;
        this.isEngineFine = isEngineFine;
        this.isFuelFillerFlapClosed = isFuelFillerFlapClosed;
        this.areDoorsClosed = areDoorsClosed;
        setEngineStarted(isEngineStarted);
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        if (fuelLevel < 0.0){
            isEngineStarted = false;
        }
        this.fuelLevel = fuelLevel;
    }

    public boolean isEngineFine() {
        return isEngineFine;
    }

    public void setEngineFine(boolean engineFine) {
        if (!isEngineFine){
            isEngineStarted = false;
        }
        isEngineFine = engineFine;
    }

    public boolean isFuelFillerFlapClosed() {
        return isFuelFillerFlapClosed;
    }

    public void setFuelFillerFlapClosed(boolean fuelFillerFlapClosed) {
        isFuelFillerFlapClosed = fuelFillerFlapClosed;
    }

    public boolean isAreDoorsClosed() {
        return areDoorsClosed;
    }

    public void setAreDoorsClosed(boolean areDoorsClosed) {
        this.areDoorsClosed = areDoorsClosed;
    }

    public boolean isEngineStarted() {
        return isEngineStarted;
    }

    public void setEngineStarted(boolean engineStarted) {
        isEngineStarted = engineStarted;
    }

    public int start(){
        int systemCheck = systemCheck();
        setEngineStarted(true);
        return systemCheck;
    }

    public int systemCheck(){
        if (!isEngineFine){
            return ENGINE_BROKEN;
        }
        if (fuelLevel == 0){
            return NO_FUEL;
        }
        if (!areDoorsClosed){
            return CAR_STARTED_WITH_DOORS_OPENED;
        }
        if (!isFuelFillerFlapClosed){
            return CAR_STARTED_WITH_OPEN_FUEL_FILLER_FLAP;
        }
        return CAR_STARTED;
    }

    public String status(){
        if (systemCheck() == CAR_STARTED){
            return "Wszystko okej";
        }
        String status = "Status samochodu: \n";
        if (!isEngineFine){
            status += " - Silnik uszkodzony \n";
        }
        if (fuelLevel == 0.0){
            status += " - Brak paliwa \n";
        }
        if (!isFuelFillerFlapClosed){
            status += "- Zamknij wlew paliwa \n";
        }
        if (!areDoorsClosed){
            status += "- Zamknij drzwi \n";
        }
        if (isEngineStarted){
            status += "- Silnik włączony \n";
        }
        else {
            status += "- Silnik wyłąaczony \n";
        }
        return status;

    }
}
