package ar.gmm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora[] computadoras;
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS=5;

    public Orden(){
        this.idOrden = ++contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }

    public void agregarComputadoras(Computadora computadora){
        if (contadorComputadoras < MAX_COMPUTADORAS){
            computadoras[contadorComputadoras++]=computadora;
        }else {
            System.out.println("Se exedió el limite de computadoras permitidas");
        }
    }

    private double calcularTotal(){
        int total = 0;
        for (int i = 0; i < contadorComputadoras; i++){
            total += computadoras[i].obtenerTotal();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Total Compra: $" + this.calcularTotal());
        System.out.println("Computadoras:");
        for (int i = 0; i < contadorComputadoras; i++){
            System.out.println("* " + computadoras[i]);
        }
    }
}
