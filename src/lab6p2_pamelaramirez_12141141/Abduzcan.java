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
public class Abduzcan extends Alien {
    private int animales;

    public Abduzcan(int animales, String nombre, Raza raza, int edad, boolean amenza) {
        super(nombre, raza, edad, amenza);
        this.animales = animales;
    }

    public int getAnimales() {
        return animales;
    }

    public void setAnimales(int animales) {
        this.animales = animales;
    }
}
