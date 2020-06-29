package ventas;

import com.gm.ventas.*;

public class Ventas {
    public static void main(String[] args) {
        Orden orden = new Orden();
        Producto producto1 = new Producto("Mayonesa Helmans",65);
        Producto producto2 = new Producto("Yogurt Danonino",40);
        Producto producto3 = new Producto("Fideos Capeletini",85);
        Producto producto4 = new Producto("Fernet Branca",250);
        Producto producto5 = new Producto("Coca Cola 3l",145);
        Producto producto6 = new Producto("Cerveza Corona",188);

        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.agregarProducto(producto3);
        orden.agregarProducto(producto4);
        orden.agregarProducto(producto5);
        orden.agregarProducto(producto6);
        orden.mostrarOrden();

        System.out.println();

        Orden orden2 = new Orden();
        orden2.agregarProducto(producto6);
        orden2.agregarProducto(producto3);
        orden2.mostrarOrden();
    }
}
