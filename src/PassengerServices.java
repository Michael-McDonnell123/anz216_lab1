public interface PassengerServices {

    /**
     * Represents any unit providing services for passengers
     */

    /**
     * No param
     * No return
     * When implemented, the method starts the entertainment service if available
     */
    void startEntertainment();

    /**
     * No param
     * @return String
     */
    String getPassengerManifest();
}
