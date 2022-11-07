public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        OurCustomDisplay customDisplay = new OurCustomDisplay("customDisplay"),
                newCustomDisplay = new OurCustomDisplay("newCustomDisplay");
        // register customer display with weather data class to get weather updates
        customDisplay.receiveWeatherData(weatherData);
        newCustomDisplay.receiveWeatherData(weatherData);
        weatherData.simulatedMeasurementsUpdate(10, 10, 10);
        weatherData.measurementsChanges();
        weatherData.simulatedMeasurementsUpdate(20, 20, 20);
        weatherData.measurementsChanges();
        // deregister one of the observer
        weatherData.removeObserver(newCustomDisplay);
        weatherData.simulatedMeasurementsUpdate(30, 30, 30);
        weatherData.measurementsChanges();
    }
}
