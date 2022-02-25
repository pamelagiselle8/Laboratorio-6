/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_pamelaramirez_12141141;

/**
 *
 * @author pame
 */
public class Alien {
    protected String nombre;
    protected Raza raza;
    protected int edad;
    protected boolean amenza;

    public Alien(String nombre, Raza raza, int edad, boolean amenza) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.amenza = amenza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isAmenza() {
        return amenza;
    }

    public void setAmenza(boolean amenza) {
        this.amenza = amenza;
    }

    @Override
    public String toString() {
        return "Alien{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", amenza=" + amenza;
    }
}
