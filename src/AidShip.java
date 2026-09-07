public class AidShip extends Ship implements EmergencySupport{

    String addType;
    int suppliesOnBoard;
    boolean hasHelipad;

    public AidShip(String name, String registrationNumber, int tonnage, int crewSize, String currentPort, String medical, int i, boolean b) {
        super(name, registrationNumber, tonnage, crewSize, currentPort);
        this.addType = medical;
        this.suppliesOnBoard = i;
        this.hasHelipad = b;
    }

    @Override
    public void dock(String port) {
        super.dock(port);
        unloadSupplies();
    }

    public void unloadSupplies(){
        System.out.println(getName() + " : Unloading supplies");
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
        return super.toString() +
                getAidType() +
                getSuppliesOnBoard() +
                getHelipad();
    }
}
