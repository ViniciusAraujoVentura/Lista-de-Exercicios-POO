public class ConversorTemperatura {
    public double CelsiusParaFahrenheit(double C){
        return (C * 9/5) + 32;
    }
    public double FahrenheitParaCelsius(double F){
        return (F - 32) * 5/9;
    }
}
