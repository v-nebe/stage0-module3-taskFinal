package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        float temperatureFahrenheit = temperatureCelsius * 9 / 5f + 32f;
        System.out.println(temperatureFahrenheit);
    }
}
