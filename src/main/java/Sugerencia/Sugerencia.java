package Sugerencia;

import Prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Sugerencia {
    List<Prenda> prendas;
    Sugerencia(){
        prendas=new ArrayList<Prenda>();
    }
    public void add(Prenda p){
        prendas.add(p);
    }
}
