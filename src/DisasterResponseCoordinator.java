import java.util.ArrayList;

public class DisasterResponseCoordinator {

    /**
     * Attributes:
     * ArrayList<EmergencySupport> responders
     */

    ArrayList<EmergencySupport> responders;

    /**
     * a constructor that initializes all instance variables, and any other constructors as needed
     */

    public DisasterResponseCoordinator(){
        this.responders = new ArrayList<>();
    }

    public void registerResponder(EmergencySupport responder) {
        responders.add(responder);
    }

    public void deployAll() {
        System.out.println("Deploying all emergency units:");
        for (EmergencySupport responder : responders) {
            responder.deployAid();
        }
    }

    public void printAllReadinessReports() {
        System.out.println("Emergency Readiness Reports:");
        for (EmergencySupport responder : responders) {
            System.out.println(responder.getEmergencyReadinessReport());
            System.out.println("=============================");
        }
    }

    /**
     * getters and setters
     */

    public ArrayList<EmergencySupport> getResponders() {
        return responders;
    }

    public void setResponders(ArrayList<EmergencySupport> responders) {
        this.responders = responders;
    }

    @Override
    public String toString() {
        String result = "DisasterResponseCoordinator [responders=\n";
        for (EmergencySupport responder : responders) {
            result += responder.toString();
        }
        result += "\n]";
        return result;
    }

}
