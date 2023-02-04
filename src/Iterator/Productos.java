package Iterator;

import java.util.ArrayList;

public class Productos implements ProductoIterator{

    public ArrayList<Producto> lista = new ArrayList<>();

    private int posicion = 0;

    public void crear(Producto producto){
        lista.add(producto);

    }
    @Override
    public boolean hasnext() {
        return posicion < lista.size();
    }

    @Override
    public void reset() {
        posicion = 0;
    }

    @Override
    public Producto next() {
        Producto producto = lista.get(posicion);
        posicion = posicion + 1;
        return producto;
    }
}
