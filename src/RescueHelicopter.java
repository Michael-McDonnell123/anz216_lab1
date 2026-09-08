public class RescueHelicopter implements EmergencySupport {

    /**
     * Attributes:
     * String callSign
     * String baseLocation
     * int medicalKit
     * double altitude
     * double currentSpeed
     * boolean rescueHoist
     */

    String callSign;
    String baseLocation;
    int medicalKit;
    double altitude;
    double currentSpeed;
    boolean rescueHoist;

    /**
     * a constructor that initializes all instance variables, and any other constructors as needed
     */

    public RescueHelicopter(String callSign, String baseLocation, int medicalKit, double altitude, double currentSpeed, boolean rescueHoist) {
        this.callSign = callSign;
        this.baseLocation = baseLocation;
        this.medicalKit = medicalKit;
        this.altitude = altitude;
        this.currentSpeed = currentSpeed;
        this.rescueHoist = rescueHoist;
    }

    public RescueHelicopter(String callSign, String baseLocation, int medicalKit, boolean rescueHoist) {
        this.callSign = callSign;
        this.baseLocation = baseLocation;
        this.medicalKit = medicalKit;
        this.rescueHoist = rescueHoist;
    }

    /**
     * Override Methods from the implement of the EmergencySupport Interface
     */

    @Override
    public void deployAid() {
        System.out.println("Rescue helicopter " + getCallSign() + " deploying " + getMedicalKit() + " medical kits");
    }

    @Override
    public String getEmergencyReadinessReport(){
        return  "Helicopter Emergency Report:\n" +
                "Call Sign: " + getCallSign() + "\n" +
                "Base Location: " + getBaseLocation() + "\n" +
                "Medical Kits: " + getMedicalKit() + "\n" +
                "Rescue Hoist: " + (getRescueHoist() ? "Available" : "Not Available");
    }

    /**
     * getters and setters
     */

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getBaseLocation() {
        return baseLocation;
    }

    public void setBaseLocation(String baseLocation) {
        this.baseLocation = baseLocation;
    }

    public int getMedicalKit() {
        return medicalKit;
    }

    public void setMedicalKit(int medicalKit) {
        this.medicalKit = medicalKit;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean getRescueHoist() {
        return rescueHoist;
    }

    public void setRescueHoist(boolean rescueHoist) {
        this.rescueHoist = rescueHoist;
    }

    /**
     * a toString() method to return all object information as a String
     * @return String
     */

    @Override
    public String toString() {
        return "\nRescueHelicopter [callSign='" + getCallSign() +
                "', baseLocation='" + getBaseLocation() +
                "', currentSpeed=" + getCurrentSpeed() +
                ", altitude=" + getAltitude() +
                ", medicalKits=" + getMedicalKit() +
                ", hasRescueHoist=" + getRescueHoist() + " ]";
    }

}
