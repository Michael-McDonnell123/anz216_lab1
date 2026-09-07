public class PassengerShip extends Ship implements PassengerServices {

    int passengerCapacity;
    int passengerCount;
    int numberOfCabins;
    boolean entertainment;

    public PassengerShip(String name, String registrationNumber, double tonnage, int crewSize, String currentPort) {
        super(name, registrationNumber, tonnage, crewSize, currentPort);
    }

    @Override
    public void dock(String port) {
        super.dock(port);
        disembarkPassengers();
    }

    private void disembarkPassengers() {
        System.out.println( getName() + " Passenger disembarking...");
        this.passengerCount = 0;
    }

    @Override
    public void navigateTo(String shipsDestination) {
        System.out.println(getName() + " Navigating to " + shipsDestination);
    }

    @Override
    public void startEntertainment() {
        if (entertainment) {
            System.out.println(getName() + " Entertainment");
        }else  {
            System.out.println(getName() + " Not Entertainment");
        }
    }

    @Override
    public String getPassengerManifest() {
        return getName() + " Passenger Manifest " + passengerCount;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    public int getPassengerCount() {
        return passengerCount;
    }
    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }
    public int getNumberOfCabins() {
        return numberOfCabins;
    }
    public void setNumberOfCabins(int numberOfCabins) {
        this.numberOfCabins = numberOfCabins;
    }
    public boolean getEntertainment() {
        return entertainment;
    }
    public void setEntertainment(boolean entertainment) {
        this.entertainment = entertainment;
    }

    @Override
    public String toString() {
        return super.toString() +
                getPassengerCapacity() +
                getPassengerCount() +
                getNumberOfCabins() +
                getEntertainment();
    }
}
