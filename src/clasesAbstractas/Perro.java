package clasesAbstractas;

public class Perro extends Animal{

    public Perro(){
        super();
        super.setNombre("Perro");
    }

    public void moverse() {
        System.out.println("El perro se esta moviendo.");
    }

}
