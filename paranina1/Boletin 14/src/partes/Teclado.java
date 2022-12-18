/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partes;

/**
 *
 * @author dam1
 */
public class Teclado {
    /**
     * @param marca
     */
    private String marca;

    /**
     * constructor vacío.
     */
    public Teclado(){
    }

    /**
     * Getter.
     * @return marca
     */
    public String getMarca(){
        return marca;
    }

    /**
     * Setter.
     */
    public void setMarca(String brand){
        this.marca = brand;
    }

    /**
     * To string la marca de esta forma.
     * @return "marca:" @param marca .
     */
    public String toString(){
        return "marca: "+marca;
    }
}
