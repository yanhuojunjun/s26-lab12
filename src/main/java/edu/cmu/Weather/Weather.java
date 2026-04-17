package edu.cmu.Weather;

public class Weather {
    private WeatherService weatherService;
    private LengthScale scale;
    public enum LengthScale{
        INCHES,
        MILLIMETERS
    }
    /**
     * Sets the length scale for rainfall.
     *
     * @param sacle length scale to be used
     */
    public void setLengthScale(LengthScale scale) {
        this.scale = scale;
    }

    /**
     * Retrieves the rainfall measurement over the last 24 hours from the weather service in the preferred scale.
     * 
     * @throws  Exception if the current scale is invalid
     * @return the rainfall amount. If the measurement is in inches, it returns the value as is.
     *         If the measurement is not in inches, it converts the value to millimeters.
     */
    public double getRainfall() throws Exception{
        double wsRainfall = weatherService.getRainfall();
        if (scale == LengthScale.INCHES) {
            return wsRainfall;
        } else if (scale == LengthScale.MILLIMETERS) {
            return wsRainfall * 25.4;
        } else {
            throw new Exception("invalid length scale type: " + scale);
        }
    }
}
