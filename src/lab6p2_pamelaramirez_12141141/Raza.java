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
public class Raza {
    private Planeta primordial;
    private String nombre;

    public Raza(String nombre, Planeta primordial) {
        this.nombre = nombre;
        this.primordial = primordial;
    }

    public Planeta getPrimordial() {
        return primordial;
    }

    public void setPrimordial(Planeta primordial) {
        this.primordial = primordial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
