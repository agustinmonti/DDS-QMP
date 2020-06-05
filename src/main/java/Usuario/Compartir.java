package Usuario;

public class Compartir implements Interaccion{
    Guardarropa guardarropa;
    Usuario usuario;
    Compartir(Guardarropa guardarropa, Usuario usuario){
        this.guardarropa=guardarropa;
    }
    @Override
    public void aceptar() {
        usuario.agregarGuardarropas(guardarropa);
    }

    @Override
    public void revertir() {
        usuario.quitarGuardarropas(guardarropa);
    }
}
