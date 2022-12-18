/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partes;

/**
 *
 * @author dam1
 */
public class Monitor {
    /**
     * @param pulgada
     */
    private float pulgada;

    /**
     * Constructor vacío.
     */
    public Monitor(){
    }

    /**
     * Getter
     * @return pulgada.
     */
    public float getPulgada(){
        return pulgada;
    }

    /**
     * Setter.
     */
    public void setPulgada(float inch){
        this.pulgada=inch;
    }

    /**
     * toString devuelve las pulgadas de esta forma.
     * @return "pulgadas" pulgada.
     */
    public String toString(){
        return "pulgadas: "+pulgada;
    }
}
