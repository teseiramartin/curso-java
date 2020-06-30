package ar.gmm.mundopc;
import java.util.*;

public class Orden {
    private int idOrden;
    private ArrayList<Computadora> computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        this.computadoras = new ArrayList<Computadora>();
    }

    public void agregarComputadoras(Computadora computadora){
        computadoras.add(computadora);
    }

    private double calcularTotal(){
        int total = 0;
        for (int i = 0; i < computadoras.size(); i++){
            total += computadoras.get(i).obtenerTotal();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Total Compra: $" + this.calcularTotal());
        System.out.println("Computadoras:");
        for (int i = 0; i < computadoras.size(); i++){
            System.out.println("* " + computadoras.get(i));
        }
    }
}
