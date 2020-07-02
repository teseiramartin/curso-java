package clasesAbstractas;

public class Ave extends Animal{

    public Ave(){
        super();
        super.setNombre("Ave");
    }

    public void moverse() {
        System.out.println("El ave esta volando");
    }
}
