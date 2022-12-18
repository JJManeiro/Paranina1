/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7d;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin7d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obx = new Scanner (System.in);
        System.out.println("Dame seu peso");
        short num1=obx.nextShort();
        System.out.println("Dame o peso do outro");
        short num2=obx.nextShort();
        if (num1>=num2){
            System.out.println("A diferenza é de "+(num1-num2)+" kilos");
       }
        else {
            System.out.println("A diferenza é de "+(num2-num1)+" kilos");
        }
    } 
}
