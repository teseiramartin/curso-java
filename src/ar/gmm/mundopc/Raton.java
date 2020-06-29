package ar.gmm.mundopc;

public class Raton extends DispositivoEntrada{
    private int idRaton;
    private double precio;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca, double precio){
        super(tipoEntrada,marca);
        this.idRaton = ++contadorRatones;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + "Raton{" +
                "idRaton=" + idRaton +
                ", precio=" + precio +
                '}';
    }
}
