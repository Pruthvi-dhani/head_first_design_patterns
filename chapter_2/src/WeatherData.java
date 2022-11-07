import java.util.*;

public class WeatherData implements Subject {

    private List<Observer> displayElements;
    private float temperature, humidity, pressure;

    public WeatherData() {
        displayElements = new ArrayList<>();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public void simulatedMeasurementsUpdate(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    @Override
    public void registerObserver(Observer o) {
        displayElements.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        displayElements.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer displayElement: displayElements)
            displayElement.update();
    }

    public void measurementsChanges() {
        notifyObservers();
    }
}
