import java.io.IOException;
import java.util.ArrayList;

public class WeatherTest {
    public static void main(String[] args) throws IOException {
        ArrayList<WeatherInfo> namesWeather = ReadWriteWeather.readFile("cities.txt");
        ReadWriteWeather.writeFile(namesWeather);
        System.out.println("Dane zostały pomyślnie zapisane do pliku!");
    }
}
