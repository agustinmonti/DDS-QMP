package Prenda;

import java.util.Objects;

public class Prenda {
    Material material;
    TipoPrenda tipo;
    Color color;
    Color color2;
    Trama trama;
    public Prenda(Material material,TipoPrenda tipo,Trama trama, Color color,Color color2){
        this.material= Objects.requireNonNull(material,"El material es obligatorio");
        this.tipo=Objects.requireNonNull(tipo,"El tipo de prenda es obligatorio");
        this.color=Objects.requireNonNull(color,"El primer color es obligatorio");
        this.color2=color2;
    }
    public boolean tieneUnSoloColor(){
        return this.color2==null;
    }
}
