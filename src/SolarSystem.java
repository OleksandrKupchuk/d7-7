public enum SolarSystem {
    MERCURY(1, 0f, 0f, 2439.7f, null, "VENUS"),
    VENUS(2, 50.27f, 0f, 6051.8f, MERCURY, "EARTH"),
    EARTH(3, 41.44f, 0f, 6378.14f, VENUS, "MARS"),
    MARS(4, 78.39f, 0f, 3397f, EARTH, "JUPITER"),
    JUPITER(5, 550.37f, 0f, 71492f, MARS, "SATURN"),
    SATURN(6, 648.65f, 0f, 60268f, JUPITER, "URANUS"),
    URANUS(7, 1448.26f, 0f, 25559f, SATURN, "NEPTUNE"),
    NEPTUNE(8, 1629.12f, 0f, 24764f, URANUS, null);

    private int serialNumberFromSun;
    private float distanceToPreviousPlanetInMillionKilometers;
    private float distanceToSunInMillionKilometers;
    private float radiusInKilometers;
    private SolarSystem previousPlanet;
    private String nextPlanet;

    SolarSystem(int serialNumberFromSun, float distanceToPreviousPlanetInMillionKilometers, float distanceToSunInMillionKilometers,
                float radiusInKilometers, SolarSystem previousPlanet, String nextPlanet) {
        this.serialNumberFromSun = serialNumberFromSun;
        this.distanceToPreviousPlanetInMillionKilometers = distanceToPreviousPlanetInMillionKilometers;
        this.distanceToSunInMillionKilometers = previousPlanet != null ? previousPlanet.distanceToSunInMillionKilometers + distanceToPreviousPlanetInMillionKilometers : 57.89f;
        this.radiusInKilometers = radiusInKilometers;
        this.previousPlanet = previousPlanet;
        this.nextPlanet = nextPlanet;
    }

    public int getSerialNumberFromSun(){
        return serialNumberFromSun;
    }

    public float getDistanceToPreviousPlanetInMillionKilometers(){
        return distanceToPreviousPlanetInMillionKilometers;
    }

    public float getDistanceToSunInMillionKilometers(){
        return this.distanceToSunInMillionKilometers;
    }

    public float getRadiusInKilometers(){
        return radiusInKilometers;
    }

    public SolarSystem getPreviousPlanet(){
        return previousPlanet;
    }

    public String getNextPlanet(){
        return nextPlanet;
    }
}