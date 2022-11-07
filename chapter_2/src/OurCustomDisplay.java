public class OurCustomDisplay implements DisplayElement, Observer {
    private float temperature, humidity, pressure;
    private WeatherData weatherData;
    private String name;

    public OurCustomDisplay(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println(name + " Current temperature: " + temperature
                + " Current humidity: " + humidity + " Current pressure: " + pressure);
    }

    @Override
    public void update() {
        // pull the latest values from observer
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        pressure = weatherData.getPressure();
        display();
    }

    public void receiveWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
        // register with observer
        weatherData.registerObserver(this);
    }
}
