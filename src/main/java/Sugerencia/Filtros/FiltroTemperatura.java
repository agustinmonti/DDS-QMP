package Sugerencia.Filtros;

import Sugerencia.Sugerencia;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroTemperatura implements Filtro {
    @Override
    public List<Sugerencia> filtrar(List<Sugerencia> sugerencias) {
        return sugerencias
                .stream()
                .filter(sugerencia -> cumple(sugerencia))
                .collect(Collectors.toList());
    }

    private boolean cumple(Sugerencia sugerencia) {
        return true;
    }
}
