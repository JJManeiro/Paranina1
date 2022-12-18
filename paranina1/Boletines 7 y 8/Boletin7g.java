/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7g;

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author dam1
 */
public class Boletin7g {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu = Integer.parseInt (JOptionPane.showInputDialog("Pulse 1 para cuadrados,2 para traingulos,3 para circulos."));
        Scanner obx = new Scanner (System.in);
        if (menu<1 || menu>3){
        System.out.println("Non hai mais opciones neste momento, sintoo.");
        }
        switch (menu) 
        {
            case 1:
            System.out.println("Canto mide o lado?");
            float lado=obx.nextFloat(); 
            float cuadrado = (float)Math.pow (lado,2);
            System.out.println("O resultado do area é de "+cuadrado);
            break;
            case 2:
            System.out.println("Canto é a base?");
            float base=obx.nextFloat();
            System.out.println("e a altura?");
            float altura=obx.nextFloat();
            float triangulo = (base*altura)/2;
            System.out.println("O resultado do area é de "+triangulo);
            break;
            case 3:
            System.out.println("Canto é o radio?");
            double radio=obx.nextDouble();
            double circulo = Math.PI*Math.pow(radio,2);
            System.out.println("O resultado do area é de "+circulo);    
            break;
        }
    }
}