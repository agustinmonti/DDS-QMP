package Prenda;

import java.util.Objects;

public class PrendaBorrador {
    Material material;
    TipoPrenda tipo;
    Color color;
    Color color2;
    Trama trama=Trama.LISA;
    public void crearPrenda(TipoPrenda tipo){
        this.tipo= Objects.requireNonNull(tipo,"Debé ingresar el tipo de prenda");
    }
    public void elegirAspecto(Color color,Color color2,Trama trama, Material material){
        Objects.requireNonNull(this.tipo,"Debe crear la prenda con su tipo antes de elegir su aspecto");
        this.material= Objects.requireNonNull(material,"Debé ingresar el material");
        if(trama!=null)
            this.trama=trama;
        this.color=Objects.requireNonNull(color,"Debé ingresar un color");
        this.color2=color2;
    }
    public Prenda guardarPrenda(){
        return new Prenda(this.material,this.tipo,this.trama,this.color,this.color2);
    }
}
