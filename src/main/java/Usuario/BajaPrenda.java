package Usuario;

import Prenda.Prenda;

public class BajaPrenda implements Interaccion {
    Prenda prenda;
    Guardarropa guardarropa;
    Boolean aceptada=false;
    public BajaPrenda(Prenda prenda, Guardarropa guardarropa){
        this.prenda=prenda;
        this.guardarropa=guardarropa;
    }
    @Override
    public void aceptar(){
        guardarropa.quitarPrenda(prenda);
        aceptada=true;
    }

    @Override
    public void revertir() {
        guardarropa.agregarPrenda(prenda);
        aceptada=false;
    }
}
