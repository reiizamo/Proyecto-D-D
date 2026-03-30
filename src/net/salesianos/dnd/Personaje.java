package net.salesianos.dnd;

public class Personaje {
    private String nombre;
    private int nivel;
    protected int energia = 100;
    static private int totalPersonajes = 0;

    public Personaje(String nombre, int nivel){
        this.nombre = nombre;
        this.nivel = nivel;
        totalPersonajes++;
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

    public void entrenar(int niveles){
        if(niveles == 0){
            System.out.println("No se puede entrenar 0 niveles.");
            return;
        }
        this.nivel = this.nivel+niveles;
    }
    public void descansar(int energia){
        if(energia == 0 || energia > 100){
            System.out.println("No se puede aumentar la energía 0 veces ni a más de 100.");
            return;
        }
        this.energia = this.energia+energia;
        if (this.energia > 100){
            this.energia = 100;
        }
    }
    public void gastarEnergia(int energia){
        this.energia = this.energia-energia;
        if (this.energia < 0){
            this.energia = 0;
        }
    }
    public void mostrarInfo(){
        System.out.println("Soy " + this.nombre + "\n" +"Nivel: " + this.nivel +"\n" + "Energía: " + this.energia);
    }
    public static void mostarTotalPersonajes(){
        System.out.println("Hay " + totalPersonajes + " personajes creados.");
    }
}
