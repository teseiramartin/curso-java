package interfaces;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Bicicleta bici = new Bicicleta();

        auto.avanzar();
        auto.detenerse();

        bici.avanzar();
        bici.detenerse();
        bici.sentarse();
    }
}
