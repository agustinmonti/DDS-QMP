package Usuario;

import Prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Guardarropa {
    private Usuario dueño;
    private String nombre;
    List<Prenda> prendas=new ArrayList<Prenda>();
    Guardarropa(String nombre, Usuario dueño){
        this.nombre=nombre;
        this.dueño=dueño;
    }
    public void agregarPrenda(Prenda prenda) {
        prendas.add(prenda);
    }

    public void quitarPrenda(Prenda prenda) {
        prendas.remove(prenda);
    }
    public void compartirCon(Usuario usuario){
        usuario.nuevaInteraccion(new Compartir(this,usuario));
    }
}
