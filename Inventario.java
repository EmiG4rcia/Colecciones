package Practico5;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario(){
        this.productos=new ArrayList<>();
    }

    public Inventario(ArrayList<Producto> productos){
        this.productos=productos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void addProducto(Producto p){
        this.productos.add(p);
    }

    //kata 2

    public String buscarProductoPorId(int id){
        
    }
}
