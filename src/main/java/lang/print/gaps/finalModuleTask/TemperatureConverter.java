package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        int tempFarenheit = Math.round((temperatureCelsius * 9/5) + 32);
        System.out.println(tempFarenheit);
    }
}
