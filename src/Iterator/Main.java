package Iterator;

public class Main {
    public static void main(String[] args) {
        Productos productos = new Productos();
        productos.crear(new Producto("TV"));
        productos.crear(new Producto("PC"));
        productos.crear(new Producto("IPad"));
        productos.crear(new Producto("NoteBook"));


        while (productos.hasnext()){
            Producto producto = productos.next();
            System.out.println("Productos " + producto.getNombre());
        }

        //productos.crear(new Producto("Pol"));
    }
}