/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7c;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin7c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt (JOptionPane.showInputDialog("Cal e teu numero?"));
        if (numero==0){
        System.out.println(numero);
        }
        else if (numero<0){
            System.out.println("-");
        }
        else{
            System.out.println("+");
        }
                
                
        
    }
    
}
