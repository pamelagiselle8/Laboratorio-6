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
public class Explorador extends Alien {
    private ArrayList <Planeta> planetasExplorados = new ArrayList();
    private Planeta planetaFavorito;

    public Explorador(String nombre, Raza raza, int edad, boolean amenza, ArrayList<Planeta> planetasExplorados, Planeta planetaFavorito) {
        super(nombre, raza, edad, amenza);
        this.planetasExplorados = planetasExplorados;
        this.planetaFavorito = planetaFavorito;
    }

    public ArrayList<Planeta> getPlanetasExplorados() {
        return planetasExplorados;
    }

    public void setPlanetasExplorados(ArrayList<Planeta> planetasExplorados) {
        this.planetasExplorados = planetasExplorados;
    }

    public Planeta getPlanetaFavorito() {
        return planetaFavorito;
    }

    public void setPlanetaFavorito(Planeta planetaFavorito) {
        this.planetaFavorito = planetaFavorito;
    }

    
    
    
}
