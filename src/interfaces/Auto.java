package interfaces;

public class Auto implements Rueda{
    public Auto(){}

    public void avanzar() {
        //int otro = valor;
        System.out.println("el auto avanza");
    }

    public void detenerse() {
        System.out.println("el auto se detiene");
    }
}
