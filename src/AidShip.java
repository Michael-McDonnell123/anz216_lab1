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

    @Override
    public void dock(String port) {
        super.dock(port);
        unloadSupplies();
    }

    public void unloadSupplies(){
        this.suppliesOnBoard = 0;
    }

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

    @Override
    public void navigateTo(String shipsDestination) {
        System.out.println(getName() + " Ship Destination: " + shipsDestination);
    }

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
