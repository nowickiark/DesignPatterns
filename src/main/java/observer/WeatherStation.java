package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WeatherStationInterface {


    private List<WeatherDisplayInterface> displayObservers = new ArrayList<>();

    private int temperature;

    private int humidity;

    @Override
    public void add(WeatherDisplayInterface weatherDisplay) {
        displayObservers.add(weatherDisplay);
    }

    @Override
    public void remove(WeatherDisplayInterface weatherDisplay) {
        displayObservers.remove(weatherDisplay);
    }

    @Override
    public void notifyAllDisplays() {

        displayObservers.forEach(osberver -> osberver.update());

    }

    public int getTemperature(){
        return temperature;
    }

    public int getHumidity(){
        return humidity;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllDisplays();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllDisplays();
    }



}
