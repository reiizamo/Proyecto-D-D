package net.salesianos.dnd.guerrero;
import net.salesianos.dnd.Personaje;
public class Guerrero extends Personaje{
    private String arma;

    public Guerrero(String nombre, int nivel, String arma){
        super(nombre, nivel);
        this.arma = arma;
    }

    public void ataquePesado(){
        System.out.println(getNombre() +" ha atacado");
        energia = energia-15;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Soy " + getNombre() + "\n" +"Arma: "+  this.arma + "\n" + "Nivel: " + getNivel() +"\n" + "Energía: " + energia);
    }
}
