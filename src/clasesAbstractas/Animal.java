package clasesAbstractas;

public abstract class Animal {
    private String nombre;

    public Animal(){}

    public void comer(){
        System.out.println("El "+this.nombre +" esta comiendo.");
    }

    public abstract void moverse();

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}
