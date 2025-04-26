package Practico5;

public enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Productos electrónicos"),
    ROPA("Productos textiles"),
    HOGAR("Productos para el hogar");

    private final String descripcion;

    CategoriaProducto(String descripcion){
        this.descripcion=descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }
}
