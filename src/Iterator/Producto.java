package Iterator;

public class Producto {



    private String nombre;
    private String edad;

    private Producto(){

    }

    public Producto(String nombre){

        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
