package Practico5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto p1= new Producto("Mesa",794.78,3,CategoriaProducto.HOGAR);
        Producto p2= new Producto("Televisor",78000.99,1,CategoriaProducto.ELECTRONICA);
        Producto p3=new Producto("Bufanda",1000.00,2,CategoriaProducto.ROPA);
        Producto p4=new Producto("Arroz",17.99,1,CategoriaProducto.ALIMENTOS);
        Producto p5=new Producto("Lavadora", 519.99,2,CategoriaProducto.ELECTRONICA);

        Inventario i1 = new Inventario();
        i1.addProducto(p1);
        i1.addProducto(p2);
        i1.addProducto(p3);
        i1.addProducto(p4);
        i1.addProducto(p5);

        for(Producto p : i1.getProductos()){
            System.out.println("producto: "+p.getNombre()+"     Categoria: "+p.getCategoria());
        }

        System.out.println(i1.buscarProductoPorId(3));

        i1.filtrarPorCategoria(CategoriaProducto.ELECTRONICA);

        i1.eliminarProducto(4);

        i1.listarProductos();

        System.out.println("\nStock total:"+i1.obtenerTotalStock());

        Producto p6= i1.obtenerProductoConMayorStock();
        System.out.println("\nProducto con mayor stock: "+p6.getNombre()+"\nCantidad: "+p6.getCantidad()+"\nPrecio: "+p6.getPrecio());

        ArrayList<Producto> productosFiltrados= i1.filtrarProductosPorPrecio(1000, 3000);
        System.out.println("\nProductos con precios entre 1000 y 3000: \n");
        for(Producto p : productosFiltrados){
            System.out.println(p.toString());
        }

        i1.mostrarCategoriasDisponibles();



    }


}
