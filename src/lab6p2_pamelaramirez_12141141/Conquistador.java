/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_pamelaramirez_12141141;

import java.util.ArrayList;

/**
 *
 * @author pame
 */
public class Conquistador extends Alien {
    private ArrayList <Planeta> planetasConquistados = new ArrayList();

    public Conquistador(String nombre, Raza raza, int edad, boolean amenza) {
        super(nombre, raza, edad, amenza);
    }

    public ArrayList<Planeta> getPlanetasConquistados() {
        return planetasConquistados;
    }

    public void setPlanetasConquistados(ArrayList<Planeta> planetasConquistados) {
        this.planetasConquistados = planetasConquistados;
    }
    
    
}
