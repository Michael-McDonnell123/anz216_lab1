public abstract class Ship implements Navigable {
    private String name;
    private String registrationNumber;
    private double tonnage;
    private int crewSize;
    private double currentSpeed;
    private String currentPort;

    public Ship(String name, String registrationNumber, double tonnage, int crewSize, String currentPort) {
        this.name = name;
        this.registrationNumber = registrationNumber;
        this.tonnage = tonnage;
        this.crewSize = crewSize;
        this.currentPort = currentPort;
    }

    public void dock(String port) {
        this.currentPort = port;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getCurrentPort() {
        return currentPort;
    }

    public void setCurrentPort(String currentPort) {
        this.currentPort = currentPort;
    }

    @Override
    public String toString() {
        return "Ship [name=" + getName() +
                ", registrationNumber=" + getRegistrationNumber() +
                ", tonnage=" + getTonnage() +
                ", crewSize=" + getCrewSize() +
                ", currentSpeed="+ getCurrentSpeed() +
                ", currentPort=" + getCurrentPort() +
                "]";
    }
}
