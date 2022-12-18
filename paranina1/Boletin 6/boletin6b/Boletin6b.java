/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin6b;
import boletin6b.Satelite;
/**
 *
 * @author dam1
 */
public class Boletin6b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Satelite Varuna = new Satelite (322,255,693);
       Varuna.setMeridiano(11);
       Varuna.setParalelo(22);
       Varuna.setDistancia(33);
       Varuna.Locacion();
    }
    
}
