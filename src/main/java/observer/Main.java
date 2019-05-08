package observer;

public class Main {

    public static void main(String[] args) {

        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplayInterface myPhone = new WeatherDisplay("myPhone",weatherStation);
        WeatherDisplayInterface otherPhone = new WeatherDisplay("otherPhone", weatherStation);
        WeatherDisplayInterface tableStation = new WeatherDisplay("tableStation", weatherStation);

        weatherStation.add(myPhone);
        weatherStation.add(otherPhone);
        weatherStation.add(tableStation);

        weatherStation.setHumidity(40);
        weatherStation.setTemperature(24);

        myPhone.showDisplay();

        weatherStation.setTemperature(30);

        otherPhone.showDisplay();


    }

}
