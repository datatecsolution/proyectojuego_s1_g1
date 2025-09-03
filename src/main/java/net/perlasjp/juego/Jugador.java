package net.perlasjp.juego;

public class Jugador {
    private String nombre;
    private int salud;
    private int fuerza;
    
    public int atacar(){
        return 0;


    }
    public void recibirDanio(int danio){
         salud = salud - cantidad;
        if (salud < 0) salud = 0;

    }
    public boolean estaVivo(){
        return false;

    }  
    public Jugador (String nombre){
        this.nombre = nombre;
        this.salud = 100;
        this.fuerza = 10;

    }
    public String getNombre(){
        return nombre;

    }
    public int getSalud(){
        return salud;

    }
    public void mostrarEstado(){
        System.out.println("Jugador: " + nombre);
        System.out.println("Salud: " + salud);
        System.out.println("Ataque: " + fuerza);

    }

}




