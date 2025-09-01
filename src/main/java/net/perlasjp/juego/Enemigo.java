package net.perlasjp.juego;

import java.util.Random;

public class Enemigo {

    private String nombre;
    private int salud;
    private int fuerza;

    public Enemigo(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = new Random().nextInt(6) + 5; // Fuerza entre 5 y 10
    }

    public int atacar() {
        return fuerza;
    }

    public void recibirDanio(int cantidad) {
        salud -= cantidad;
        if (salud < 0) {
            salud = 0;
        }
    }

    public boolean estaVivo() {
        return salud > 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }
}



