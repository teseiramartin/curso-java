package clasesAbstractas;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal ave = new Ave();

        perro.comer();
        perro.moverse();

        ave.comer();
        ave.moverse();
    }
}
