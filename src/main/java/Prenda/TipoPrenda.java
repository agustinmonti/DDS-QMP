package Prenda;



public enum TipoPrenda {
    ZAPATO {
        Categoria categoria = Categoria.CALZADO;
    },
    REMERA{
        Categoria categoria = Categoria.SUPERIOR;
    },
    PANTALON{
        Categoria categoria = Categoria.INFERIOR;
    },
    RELOJ{
        Categoria categoria= Categoria.ACCESORIO;
    };
    private Categoria categoria;
    public Categoria getCategoria(){
        return categoria;
    }
//    ETC, el enunciado no da una lista de Tipos de Prendas.
}
