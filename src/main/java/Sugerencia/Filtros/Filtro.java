package Sugerencia.Filtros;

import Sugerencia.Sugerencia;

import java.util.List;

public interface Filtro {
    public List<Sugerencia> filtrar(List<Sugerencia> sugerencias);
}
