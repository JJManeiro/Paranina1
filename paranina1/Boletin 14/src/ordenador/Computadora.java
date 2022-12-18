/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenador;
/**
 *
 * @author dam1
 */
public class Computadora {
    /**
     * @param precio
     */
    private float precio;

    /**
     * Getter.
     * @return precio
     */
    public float getPrecio(){
        return precio;
    }

    /**
     * Setter.
     */
    public void setPrecio(float prize){
        this.precio=prize;
    }

    /**
     * toString devuelve el precio de esta forma
     * @return "precio:" precio.
     */
    public String toString(){
        return "precio: "+precio;
    }
}
