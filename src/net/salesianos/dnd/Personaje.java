package net.salesianos.dnd;

public class Personaje {
    String nombre;
    int nivel;
    int energia = 100;

    public Personaje(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;
    }

    public String getNombre(){
        return this.nombre;
    }
    public int getNivel(){
        return this.nivel;
    }
    public int getEnergia(){
        return this.energia;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNivel(int nivel){
        this.nivel = nivel;
    }
    public void setEnergia(int energia){
        this.energia = energia;
    }
}
