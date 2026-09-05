public interface Navigable {

    /**
     * Represents all vehicles that can move/navigate
     */

    /**
     *
     * @param shipsDestination representing the ships destination
     * does not return anything
     *
     */
    void navigateTo(String shipsDestination);

    /**
     *
     * @param speed takes a speed
     * does not return anything
     *
     */
    void setCurrentSpeed(double speed);

    /**
     *
     * no parameters
     * @return the current speed
     */
    double getCurrentSpeed();
}
