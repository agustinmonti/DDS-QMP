package Sugerencia.Clima;

import Sugerencia.Sugerencia;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class AccuWeather implements Clima {
    @Override
    public double getTemperatura(String Ciudad) {
        AccuWeatherAPI apiClima = new AccuWeatherAPI();
        List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(Ciudad);
        List<Map<String, Object>> temperaturas=
                (List<Map<String, Object>>) condicionesClimaticas.get(0).get("Temperatura");
        return Math.toDegrees((Double) temperaturas.get(0).get("Value"));
    }
}
