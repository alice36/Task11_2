public class WeatherInfo {
    private String city;
    private int temperature;
    private String description;


    public WeatherInfo(String city, int temperature, String description) {
        this.city = city;
        this.temperature = temperature;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return city + " " + temperature + " " + description;
    }

    public String format(){
        return city + ";" + temperature + ";" + description;
    }

}
