/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partes;

/**
 *
 * @author dam1
 */
public class CPU {
    /**
     * @param Velocidad
     */
    private int velocidad;

    /**
     * Constructor vacío
     */
    public CPU(){
    }

    /**
     * Getter.
     * @return Velocidad
     */
    public int getVelocidad(){
    return velocidad;
    }

    /**
     * Setter.
     */
    public void setVelocidad(int speed){
        this.velocidad=speed;
    }

    /**
     * toString devuelve la velocidad de esta forma:
     * @return "velocidad:" velocidad.
     */
    public String toString(){
        return "velocidad: "+velocidad;
    }
}
