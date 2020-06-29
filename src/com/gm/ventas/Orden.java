package com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAXIMO_PRODUCTOS=5;

    public Orden(){
        this.idOrden=++contadorOrdenes;
        productos = new Producto[MAXIMO_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if (contadorProductos < MAXIMO_PRODUCTOS){
            productos[contadorProductos++]=producto;
        }else {
            System.out.println("Se supero el maximo de productos permitido: " + MAXIMO_PRODUCTOS);
        }
    }

    private double calcularTotal (){
        int total = 0;
        for (int i = 0; i < contadorProductos; i++){
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Total de la compra: $" + this.calcularTotal());
        System.out.println("Productos:");
        for (int i = 0; i < contadorProductos; i++){
            System.out.println("* "+ productos[i]);
        }
    }
}
