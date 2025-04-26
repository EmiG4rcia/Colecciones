package Practico5;

public class Main {
    public static void main(String[] args) {
        Producto p1= new Producto("Mesa",794.78,3,CategoriaProducto.HOGAR);
        Producto p2= new Producto("Televisor",78000.99,1,CategoriaProducto.ELECTRONICA);
        Producto p3=new Producto("Bufanda",41.00,2,CategoriaProducto.ROPA);

        Inventario i1 = new Inventario();
        i1.addProducto(p1);
        i1.addProducto(p2);
        i1.addProducto(p3);

        for(Producto p : i1.getProductos()){
            System.out.println("producto: "+p.getNombre()+"     Categoria: "+p.getCategoria());
        }

        System.out.println(i1.getProductos());
    }
}
