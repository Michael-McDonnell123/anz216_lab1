public interface PassengerServices {

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
