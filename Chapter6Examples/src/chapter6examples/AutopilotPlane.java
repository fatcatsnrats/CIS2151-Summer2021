package chapter6examples;

public class AutopilotPlane {

    private int maxAltitudeInMeters;
    private boolean landingGearEnabled;
    private int currentAltitudeInMeters;
    private String name;
    private final int ALTITUDE_AT_WHICH_LANDING_GEAR_IS_REQUIRED_IN_METERS = 1000;

    public AutopilotPlane(int maxAltitudeInMeters, String name) {
        this.maxAltitudeInMeters = maxAltitudeInMeters;
        this.name = name;
        currentAltitudeInMeters = 0;
        landingGearEnabled = true;
    }

    public boolean changeAltitude(int metersToChange) {
        if (currentAltitudeInMeters + metersToChange < 0) {
            return false;
        }

        currentAltitudeInMeters += metersToChange;

        if (currentAltitudeInMeters > ALTITUDE_AT_WHICH_LANDING_GEAR_IS_REQUIRED_IN_METERS) {
            landingGearEnabled = false;
        } else {
            landingGearEnabled = true;
        }
        if (currentAltitudeInMeters > maxAltitudeInMeters) {
            currentAltitudeInMeters = maxAltitudeInMeters;
        }
        return true;
    }

    public int getMaxAltitudeInMeters() {
        return maxAltitudeInMeters;
    }

    public boolean isLandingGearEnabled() {
        return landingGearEnabled;
    }

    public int getCurrentAltitudeInMeters() {
        return currentAltitudeInMeters;
    }

    public String getName() {
        return name;
    }

}
