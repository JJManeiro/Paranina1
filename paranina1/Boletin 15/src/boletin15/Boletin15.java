/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin15;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Boletin15 {

    public static String pedirString (String Mensaje){
        return JOptionPane.showInputDialog(Mensaje);
    }
    
    public static void main(String[] args) {
        String MA = pedirString("Actor Principal");
        String FA = pedirString("Actriz Principal");
        String AP = pedirString("Autor de la peli");
        String TP = pedirString("Titulo");
        String FP = pedirString("Formato");
        
        String GM = pedirString("Genero musical");
        String AD = pedirString("Autor del disco");
        String TD = pedirString("Titulo");
        String FD = pedirString("Formato");
        
        Peliculas P = new Peliculas (MA,FA,TP,AP,FP,1.4f);
        System.out.println ("La pelicula es: \n"+P.toString());
        Discos D = new Discos (GM,TD,AD,FD,0.8f);
        System.out.println("EL disco es \n"+D.toString());
    }
}
