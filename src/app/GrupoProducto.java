package app;
import java.util.*;

public class GrupoProducto implements Producto {

    
    private class Orden implements Comparator<Producto>{
        @Override
        public int compare(Producto p1 , Producto p2){
            if(p1.getNombre().equals(p2.getNombre())){
                return 1;
            }else if(p1.getNombre().equals(p2.getNombre())){
                return -1;
            }else{
                return 0; 
            }
        }
    }
    private String nombreGrupo;
    private ArrayList<Producto> conjuntoGrupo;
    
    
    public GrupoProducto(String nombre){
        this.nombreGrupo = nombre;
        this.conjuntoGrupo = new ArrayList<>();
    }
    
    @Override
    public String getNombre() {
       return this.nombreGrupo;
    }
    
    public void añadir(Producto p){
        if(!conjuntoGrupo.contains(p)){
            conjuntoGrupo.add(p);
        }
    }
    
    public void eliminar(Producto p){
        if(conjuntoGrupo.contains(p)){
            conjuntoGrupo.remove(p);
        }
    }
    
    public List<Producto> setOrden(){
        Set<Producto> aux = new TreeSet<>(new Orden());
        
        ArrayList<Producto> resultado = new ArrayList<>();
        
        for(Producto p : conjuntoGrupo){
            aux.add(p);
        }
        for(Producto p1 : aux){
            resultado.add(p1);
        }
        return resultado;
    }
    
    @Override
    public String print() {
        String result = this.nombreGrupo + ": ";
        
        for(Producto p : conjuntoGrupo){
            result += p.print() + ", ";
        }
        
        result = result.substring(0 , result.length()-2);
        
        return result ;
    }
    
}
