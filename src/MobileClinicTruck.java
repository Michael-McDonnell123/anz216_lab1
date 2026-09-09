public class MobileClinicTruck  implements EmergencySupport{

    /**
     * private Attributes:
     * String truckID
     * String region
     * int doctorCount
     * boolean stockedMedicine
     */

    private String truckID;
    private String region;
    private int doctorCount;
    private boolean stockedMedicine;

    /**
     * a constructor that initializes all instance variables, and any other constructors as needed
     */

    public MobileClinicTruck(String truckID, String region, int doctorCount, boolean stockedMedicine) {
        this.truckID = truckID;
        this.region = region;
        this.doctorCount = doctorCount;
        this.stockedMedicine = stockedMedicine;
    }

    /**
     * Override Methods from the implement of the EmergencySupport Interface
     */

    @Override
    public void deployAid() {
        System.out.println("Mobile clinic truck " + getTruckID() + " deploying " + getDoctorCount() + " doctors.");
    }

    @Override
    public String getEmergencyReadinessReport(){
        return  "Truck Emergency Report:\n" +
                "Truck ID: " + getTruckID() + "\n" +
                "Region: " + getRegion() + "\n" +
                "Doctor Count: " + getDoctorCount() + "\n" +
                "Stocked Medicine: " + (getStockedMedicine() ? "Stocked with Medicine" : "Not Stocked with Medicine");
    }

    /**
     * getters and setters
     */

    public String getTruckID() {
        return truckID;
    }

    public void setTruckID() {
        this.truckID = truckID;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getDoctorCount() {
        return doctorCount;
    }

    public void setDoctorCount(int doctorCount) {
        this.doctorCount = doctorCount;
    }

    public boolean getStockedMedicine() {
        return stockedMedicine;
    }

    public void setSockedMedicine(boolean sockedMedicine) {
        this.stockedMedicine = sockedMedicine;
    }

    /**
     * a toString() method to return all object information as a String
     * @return String
     */

    @Override
    public String toString() {
        return "\nMobileClinicTruck [ truckId=" + getTruckID() +
                ", region=" + getRegion() +
                ", doctorCount=" + getDoctorCount() +
                ", StockedWithMedicine=" + getStockedMedicine() +
                " ]";
    }
}
