package net.salesianos.dnd.mago;
import net.salesianos.dnd.Personaje;
public class Mago extends Personaje{
    String elemento;

    public Mago(String nombre, int nivel, String elemento){
        super(nombre, nivel);
        this.elemento = elemento;
    }

    
}
