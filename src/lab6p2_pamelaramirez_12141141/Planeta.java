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
public class Planeta {
    private String nombre;
    private boolean agua;
    private int tamano;
    private int temperatura;
    private ArrayList <Alien> aliensHabitando = new ArrayList();

    public Planeta(String nombre, boolean agua, int tamano, int temperatura) {
        this.nombre = nombre;
        this.agua = agua;
        this.tamano = tamano;
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAgua() {
        return agua;
    }

    public void setAgua(boolean agua) {
        this.agua = agua;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public ArrayList<Alien> getAliensHabitando() {
        return aliensHabitando;
    }

    public void setAliensHabitando(ArrayList<Alien> aliensHabitando) {
        this.aliensHabitando = aliensHabitando;
    }
    
    
}
