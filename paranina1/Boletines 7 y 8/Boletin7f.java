/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7f;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Boletin7f {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ventas = Integer.parseInt (JOptionPane.showInputDialog("Canto vendiches hoxe?"));
        if (ventas<=100){
            System.out.println("Nivel baixo");
        }
        else if (ventas>100 && ventas<500){
            System.out.println("Nivel medio");
        }
        else if (ventas>500 && ventas<1000){
            System.out.println("Nivel alto");
        }
        else{
            System.out.println("Primeira necesidade");
        }
    }
}