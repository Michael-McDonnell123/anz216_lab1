public class PassengerShip extends Ship implements PassengerServices {

    /**
     * Attributes:
     * int passengerCapacity
     * int passengerCount
     * int numberOfCabins
     * boolean entertainment
     */

    int passengerCapacity;
    int passengerCount;
    int numberOfCabins;
    boolean entertainment;

    /**
     * a constructor that initializes all instance variables, and any other constructors as needed
     */

    public PassengerShip(String name, String registrationNumber, double tonnage, int crewSize, String currentPort, int passengerCapacity, int passengerCount, int  numberOfCabins, boolean entertainment) {
        super(name, registrationNumber, tonnage, crewSize, currentPort);
        this.passengerCapacity = passengerCapacity;
        this.passengerCount = passengerCount;
        this.numberOfCabins = numberOfCabins;
        this.entertainment = entertainment;
    }

    /**
     * a dock() methods that extends the behavior of the dock() method in the parent class by unloading the passengers
     * @param port
     */

    @Override
    public void dock(String port) {
        super.dock(port);
        disembarkPassengers();
    }

    /**
     * a private disembarkPassengers() method, which takes no parameters and does not return anything. The method updates the passenger count.
     */

    private void disembarkPassengers() {
        this.passengerCount = 0;
    }

    /**
     * Override method from the extends Ship class that implements the Navigable Interface class
     * @param shipsDestination representing the ships destination
     * does not return anything
     */

    @Override
    public void navigateTo(String shipsDestination) {
        System.out.println(getName() + " Navigating to " + shipsDestination);
    }

    /**
     * Override method from the implements of PassengerServices Interface method
     */

    @Override
    public void startEntertainment() {
        if (entertainment) {
            System.out.println(getName() + " has entertainment");
        }else  {
            System.out.println(getName() + " does not have entertainment");
        }
    }

    public String getPassengerManifest() {
        return getName() + " Passenger Manifest " + passengerCount;
    }

    /**
     * getters and setters
     */

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

    /**
     * a toString() method to return all object information as a String
     * @return String
     */

    @Override
    public String toString() {
        return "Ship [name=" + getName() +
                ", registrationNumber=" + getRegistrationNumber() +
                ", tonnage=" + getTonnage() +
                ", crewSize=" + getCrewSize() +
                ", currentSpeed=" + getCurrentSpeed() +
                ", currentPort=" + getCurrentPort() +
                ", passengerCapacity=" + getPassengerCapacity() +
                ", passengerCount=" + getPassengerCount() +
                ", numberOfCabins=" + getNumberOfCabins() +
                ", entertainment=" + getEntertainment() + " ]";
    }
}
