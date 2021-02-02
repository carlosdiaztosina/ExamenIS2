package app;
import java.util.*;

public class ProductoFinal implements Producto{
    
    private String  producto;
    
    public ProductoFinal(String nombre){
        this.producto = nombre;
        
    }
    
    @Override
    public String getNombre(){
        return this.producto;
    }

    @Override
    public String print() {
        return this.getNombre();
    }
}
