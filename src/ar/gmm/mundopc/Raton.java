package ar.gmm.mundopc;

public class Raton extends DispositivoEntradaSalida {
    private int idRaton;
    private static int contadorRatones;

    public Raton(String tipoEntrada, String marca, double precio){
        super(tipoEntrada,marca,precio);
        this.idRaton = ++contadorRatones;
    }

    @Override
    public String toString() {
        return super.toString() + "Raton{" +
                "idRaton=" + idRaton +
                '}';
    }
}
