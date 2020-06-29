package mundopc;

import ar.gmm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Computadora computadora1 = new Computadora("toshiba", new Monitor("samsung",17.5,300), new Teclado("usb","redragon",200), new Raton("usb","genius",250));
        Computadora computadora2 = new Computadora("HP", new Monitor("LG",25,400), new Teclado("otra","cualquiera",150), new Raton("usb","logitech",300));

        Orden orden1 = new Orden();

        orden1.agregarComputadoras(computadora1);
        orden1.agregarComputadoras(computadora2);

        orden1.mostrarOrden();

        System.out.println();

        //prueba con otra orden
        Orden orden2 = new Orden();

        orden2.agregarComputadoras(computadora2);
        orden2.mostrarOrden();

    }
}
