package ar.gmm.mundopc;

public class Teclado extends DispositivoEntradaSalida {
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca, double precio){
        super(tipoEntrada,marca,precio);
        this.idTeclado = ++contadorTeclados;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" +
                "idTeclado=" + idTeclado +
                '}';
    }
}
