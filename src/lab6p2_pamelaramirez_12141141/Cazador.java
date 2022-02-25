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
public class Cazador extends Alien {
    private int humanos;

    public Cazador(int humanos, String nombre, Raza raza, int edad, boolean amenza) {
        super(nombre, raza, edad, amenza);
        this.humanos = humanos;
    }

    public int getHumanos() {
        return humanos;
    }

    public void setHumanos(int humanos) {
        this.humanos = humanos;
    }
    
    
}
