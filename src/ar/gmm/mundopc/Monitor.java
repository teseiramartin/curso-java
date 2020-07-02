package ar.gmm.mundopc;

public class Monitor extends DispositivoEntradaSalida {
    private int idMonitor;
    private double tamaño;
    private static int contadorMonitores;

    public Monitor(String tipoEntrada, String marca, double tamaño, double precio){
        super(tipoEntrada,marca,precio);
        this.idMonitor = ++contadorMonitores;
        this.tamaño = tamaño;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return super.toString()+"Monitor{" +
                "idMonitor=" + idMonitor + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }
}
