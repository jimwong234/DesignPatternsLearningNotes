
public class WeatherStationExample {
	public static void main(String[] args){
		WeatherData weatherData = new WeatherData();
		weatherData.setMeasurements(30,5,15);
		CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(30,5,25);
		weatherData.setMeasurements(30,6,15);
		weatherData.setMeasurements(31,5,15);
		weatherData.setMeasurements(33,5,15);
	}
}
