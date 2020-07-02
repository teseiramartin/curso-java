package ar.gmm.mundopc;

public abstract class DispositivoEntradaSalida {
    private String tipoEntrada;
    private String marca;
    private double precio;

    public DispositivoEntradaSalida(){}
    public DispositivoEntradaSalida(String tipoEntrada, String marca, double precio){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
        this.precio = precio;
    }
    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntradaSalida{" +
                "tipoEntrada='" + tipoEntrada + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
