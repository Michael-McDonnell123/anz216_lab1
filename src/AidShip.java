public class AidShip extends Ship implements EmergencySupport{

    String addType;
    int suppliesOnBoard;
    boolean hasHelipad;

    public AidShip(String name, String registrationNumber, double tonnage, int crewSize, String currentPort) {
        super(name, registrationNumber, tonnage, crewSize, currentPort);
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

    }

    @Override
    public String getEmergencyReadinessReport() {
        return "";
    }

    @Override
    public void navigateTo(String shipsDestination) {

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
