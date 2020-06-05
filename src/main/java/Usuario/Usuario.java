package Usuario;

import Prenda.Prenda;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
//    private Integer userID;
    List<Guardarropa> guardarropas= new ArrayList<Guardarropa>();
    List<Interaccion> interacciones = new ArrayList<Interaccion>();
    public void nuevoGuardarropa(){
        guardarropas.add(new Guardarropa("Nuevo Guardarropa",this));
    }

    public void agregarGuardarropas(Guardarropa guardarropa) {
        guardarropas.add(guardarropa);
    }

    public void quitarGuardarropas(Guardarropa guardarropa) {
        guardarropas.remove(guardarropa);
    }
    public void nuevaInteraccion(Interaccion interaccion){
        interacciones.add(interaccion);
    }

}

