package interfaces;

public class Bicicleta implements Rueda, Silla{

    public void avanzar() {
        System.out.println("la bici avanza");
    }

    public void detenerse() {
        System.out.println("la bici se detiene");
    }

    public void sentarse() {
        System.out.println("sentarse");
    }
}
