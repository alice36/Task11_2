import java.io.*;
import java.util.ArrayList;

public class ReadWriteWeather {

    public static ArrayList<WeatherInfo> readFile(String fileName) throws IOException {
        WeatherApi weatherApi = new WeatherApi();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<WeatherInfo> namesWeather = new ArrayList<>();
        int i =0;
        String input;

        while((input = bufferedReader.readLine()) != null) {
            namesWeather.add(new WeatherInfo(input, weatherApi.getTemperature(input), weatherApi.getDescription(input)));
            System.out.println(namesWeather.get(i).toString());
            i++;
        }
        bufferedReader.close();
        return namesWeather;
    }

    public static void writeFile(ArrayList<WeatherInfo> arr) throws IOException {
        FileWriter fileWriter = new FileWriter("fileWeather.csv");
        BufferedWriter bfw = new BufferedWriter(fileWriter);
        for (int i = 0; i < arr.size(); i++) {
            String names = arr.get(i).format();
            bfw.write(names);
            bfw.newLine();
        }
        bfw.close();
    }
}
