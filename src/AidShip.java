public class AidShip extends Ship implements EmergencySupport{

    /**
     * Attributes:
     * String addType
     * int suppliesOnBoard
     * boolean hasHelipad
     */

    String addType;
    int suppliesOnBoard;
    boolean hasHelipad;

    /**
     * a constructor that initializes all instance variables, and any other constructors as needed
     */

    public AidShip(String name, String registrationNumber, int tonnage, int crewSize, String currentPort, String medical, int suppliesOnBoard, boolean hasHelipad) {
        super(name, registrationNumber, tonnage, crewSize, currentPort);
        this.addType = medical;
        this.suppliesOnBoard = suppliesOnBoard;
        this.hasHelipad = hasHelipad;
    }

    /**
     * a dock() methods that extends the behavior of the dock() method in the parent class by unloading the supplies
     * @param port
     */

    @Override
    public void dock(String port) {
        super.dock(port);
        unloadSupplies();
    }

    /**
     * a private unloadSupplies() method, which takes no parameters and does not return anything. The method updates the supplies on board.
     */

    public void unloadSupplies(){
        this.suppliesOnBoard = 0;
    }

    /**
     * Override Methods from the implement of the EmergencySupport Interface
     */

    @Override
    public void deployAid() {
        System.out.println("Aid Ship " + getName() + " is deploying " + getSuppliesOnBoard() + " units of " + getAidType() + " aid.");
        unloadSupplies();
    }

    @Override
    public String getEmergencyReadinessReport() {
        return "Ship Emergency Report:\n" +
                "Name: " + getName() + "\n" +
                "Aid Type: " + getAidType() + "\n" +
                "Supplies on Board: " + getSuppliesOnBoard() + "\n" +
                "Helipad: " + (getHelipad() ? "Available" : "Not Available");
    }

    /**
     * Override method from the extends Ship class that implements the Navigable Interface class
     * @param shipsDestination representing the ships destination
     * does not return anything
     */

    @Override
    public void navigateTo(String shipsDestination) {
        System.out.println(getName() + " Ship Destination: " + shipsDestination);
    }

    /**
     * Getters and setters
     */

    public String getAidType() {
        return addType;
    }

    public void setAidType(String addType) {
        this.addType = addType;
    }

    public int getSuppliesOnBoard() {
        return suppliesOnBoard;
    }

    public void setSuppliesOnBoard(int suppliesOnBoard) {
        this.suppliesOnBoard = suppliesOnBoard;
    }

    public boolean getHelipad() {
        return hasHelipad;
    }

    public void setHelipad(boolean hasHelipad) {
        this.hasHelipad = hasHelipad;
    }

    /**
     * a toString() method to return all object information as a String
     * @return String
     */

    @Override
    public String toString(){
        return "Ship [name=" + getName() +
                ", registrationNumber=" + getRegistrationNumber() +
                ", tonnage=" + getTonnage() +
                ", crewSize=" + getCrewSize() +
                ", currentSpeed=" + getCurrentSpeed() +
                ", currentPort=" + getCurrentPort() +
                ", aidType=" + getAidType() +
                ", suppliesOnBoard=" + getSuppliesOnBoard() +
                ", hasHelipad=" + getHelipad() + " ]";
    }
}
