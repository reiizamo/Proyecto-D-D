package net.salesianos.dnd;

public class Personaje {
    String nombre;
    int nivel;
    int energia = 100;

    public Personaje(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;
    }
}
