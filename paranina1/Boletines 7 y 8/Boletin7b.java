/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7b;

import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin7b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obx = new Scanner (System.in);
        System.out.println("Dame un numero");
        short num1=obx.nextShort();
        System.out.println("Dame otro");
        short num2=obx.nextShort();
        if (num1>=num2){
            System.out.println("A resta é: "+(num1-num2));
        }
            System.out.println("A suma é: "+(num1+num2));
    }
    
}
