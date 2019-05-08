package observer;

public interface WeatherStationInterface {

    public void add(WeatherDisplayInterface weatherDisplay);
    public void remove(WeatherDisplayInterface weatherDisplay);
    public void notifyAllDisplays();


}
