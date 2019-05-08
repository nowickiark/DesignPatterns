package observer;

public class WeatherDisplay implements WeatherDisplayInterface {

    private WeatherStation weatherStation;
    private int temperature;
    private int humidity;
    private String name;


    public WeatherDisplay(String name, WeatherStation weatherStation)
    {
        this.name = name;
        this.weatherStation = weatherStation;
        this.temperature = 0;
        this.humidity = 0;
    }

    @Override
    public void update() {
        this.temperature= weatherStation.getTemperature();
        this.humidity = weatherStation.getHumidity();
    }

    public void showDisplay(){
        System.out.printf("The display %s shows %n Temperature - %d %n Humidity - %d %n",name,temperature,humidity);
    }




}
