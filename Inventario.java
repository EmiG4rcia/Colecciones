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

    public void listarProductos(){
        for (Producto p:productos){
            System.out.println("\nProducto cuyo Id es "+p.getId()+": \nnombre: "+p.getNombre()+"\nprecio: "+p.getPrecio()+"\ncantidad: "+p.getCantidad()+"\ncategoria: "+p.getCategoria());
        }
    }
    //kata 2

    public String buscarProductoPorId(int id){
        for (Producto p : productos){
            if(p.getId()==id) {
                System.out.println("El producto cuyo id es: "+id+" fue encontrado.");
                return p.toString();
            }
        }
        return null;
    }
    public void eliminarProducto(int id){
        for(Producto p : productos){
            if(p.getId()==id){
                System.out.println("Se eliminó el producto: "+p.toString());
                productos.remove(p);

            }
        }
    }
    public void actualizarStock(int id, int nuevaCantidad){
        for(Producto p:productos){
            if(p.getId()==id){
            p.setCantidad(nuevaCantidad);
            }
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria){
        System.out.println("Productos que pertenecen a la cateogoria "+categoria+":\n");
        for (Producto p:productos){
            if(p.getCategoria().equals(categoria)){
                System.out.println(p.toString()+"\n");
            }
        }
    }

    //Kata 3

    public int obtenerTotalStock(){
        int sumatoria=0;
        for (Producto p:productos){
            sumatoria+=p.getCantidad();
        }
        return sumatoria;
    }

    public Producto obtenerProductoConMayorStock(){
        Producto mayorStock= productos.get(0);
        for (Producto p: productos){
            if (p.getCantidad()>mayorStock.getCantidad()){
                mayorStock=p;
            }
        }
        return mayorStock;
    }

    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){

        ArrayList<Producto> productosPorPrecio = new ArrayList<>();
        //System.out.println("Productos con precios entre $"+min+" y $"+max+"\n");

        for (Producto p: productos){
            if(p.getPrecio()>=min && p.getPrecio()<=max){
                productosPorPrecio.add(p);
               // System.out.println(p.toString());
            }
        }
        return productosPorPrecio;
    }

    public void mostrarCategoriasDisponibles(){
        System.out.println("\nCategorias Disponibles: ");
        for (CategoriaProducto c:CategoriaProducto.values()){
            System.out.println("- "+c+" Descripcion: "+c.getDescripcion());
        }
    }
}
