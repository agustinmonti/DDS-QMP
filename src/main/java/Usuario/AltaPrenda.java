package Usuario;

import Prenda.Prenda;

public class AltaPrenda implements Interaccion{
    Prenda prenda;
    Guardarropa guardarropa;
    Boolean aceptada=false;
    public AltaPrenda(Prenda prenda, Guardarropa guardarropa){
        this.prenda=prenda;
        this.guardarropa=guardarropa;
    }
    @Override
    public void aceptar() {
        guardarropa.agregarPrenda(prenda);
        aceptada=true;
    }

    @Override
    public void revertir() {
        guardarropa.quitarPrenda(prenda);
        aceptada=false;
    }
}
