/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin7e;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin7e {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obx = new Scanner (System.in);
        System.out.println("Dame un numero");
        short num1=obx.nextShort();
        System.out.println("Dame outro");
        short num2=obx.nextShort();
        System.out.println("Dame outro mais");
        short num3=obx.nextShort();
        if (num1>num2 && num2>num3){
            System.out.println("O mais grande e "+num1+" seguidos de "+num2+" e "+num3);
        }
        else if (num1>num3 && num3>num2){
            System.out.println("O mais grande e "+num1+" seguidos de "+num3+" e "+num2);
        }
        else if (num2>num1 && num1>num3){
            System.out.println("O mais grande e "+num2+" seguidos de "+num1+" e "+num3);
        }
        else if (num2>num3 && num3>num1){
            System.out.println("O mais grande e "+num2+" seguidos de "+num3+" e "+num1);
        }
        else if (num3>num1 && num1>num2){
            System.out.println("O mais grande e "+num3+" seguidos de "+num1+" e "+num2);
        }
        else if (num3>num2 && num2>num1){
            System.out.println("O mais grande e "+num3+" seguidos de "+num2+" e "+num1);
        }
    }
    
}
