/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6;
import boletin6.Coche;
/**
 *
 * @author dam1
 */
public class Boletin6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coche azul = new Coche (111);
        azul.Acelerar(11);
        System.out.println(azul.getVelocidade());
        azul.Frenar(22);
        System.out.println(azul.getVelocidade());
    }
    
}
