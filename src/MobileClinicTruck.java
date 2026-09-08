public class MobileClinicTruck  implements EmergencySupport{

    /**
     * Attributes:
     * String truckID
     * String region
     * int doctorCount
     * boolean stockedMedicine
     */

    String truckID;
    String region;
    int doctorCount;
    boolean stockedMedicine;

    /**
     * a constructor that initializes all instance variables, and any other constructors as needed
     */

    public MobileClinicTruck(String truckID, String region, int doctorCount, boolean stockedMedicine) {
        this.truckID = truckID;
        this.region = region;
        this.doctorCount = doctorCount;
        this.stockedMedicine = stockedMedicine;
    }

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

    @Override
    public String toString() {
        return "\nMobileClinicTruck [ truckId=" + getTruckID() +
                ", region=" + getRegion() +
                ", doctorCount=" + getDoctorCount() +
                ", StockedWithMedicine=" + getStockedMedicine() +
                " ]";
    }
}
