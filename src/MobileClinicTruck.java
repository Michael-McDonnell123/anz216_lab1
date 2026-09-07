public class MobileClinicTruck  implements EmergencySupport{
    String truckID;
    String region;
    int doctorCount;
    boolean stockedMedicine;



    @Override
    public void deployAid() {
        System.out.println("Deploying Helicopter " + truckID);
    }

    @Override
    public String getEmergencyReadinessReport(){
        return  "Truck Emergency Report:\n" +
                "Truck ID: " + getTruckID() + "\n" +
                "Region: " + getRegion() + "\n" +
                "Doctor Count: " + getDoctorCount() + "\n" +
                "Stocked Medicine: " + (getStockedMedicine() ? "Stocked with Medicine" : "Not Stocked with Medicine");
    }

    public MobileClinicTruck(String truckID, String region, int doctorCount, boolean b) {
        this.truckID = truckID;
        this.region = region;
        this.doctorCount = doctorCount;
        this.stockedMedicine = b;
    }

    public String getTruckID() {
        return truckID;
    }

    public void setTruckID(String truckID) {
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
        return super.toString() +
                getTruckID() +
                getRegion() +
                getDoctorCount() +
                getStockedMedicine();
    }
}
