import java.util.ArrayList;

public class DisasterResponseCoordinator {

    ArrayList<EmergencySupport> responders;

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

    public ArrayList<EmergencySupport> getResponders() {
        return responders;
    }

    public void setResponders(ArrayList<EmergencySupport> responders) {
        this.responders = responders;
    }

    @Override
    public String toString() {
        return "DisasterResponseCoordinator [responders=\n" +
                getResponders() +
                "\n]";
    }

}
