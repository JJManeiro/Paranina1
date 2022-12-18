/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenador;
import partes.CPU;
import partes.Monitor;
import partes.Teclado;
/**
 *
 * @author dam1
 * @version 25.11.2022
 */
public class Software {
    /**
     *Tras importar de las 4 clases, creamos 4 nuevos objetos.
     * pre para el precio de la pc, pro para la cpu, mo para el monitor y te para su teclado.
     */
    public static void main (String[]args){
        Computadora pre = new Computadora();
        CPU pro= new CPU();
        Monitor mo= new Monitor();
        Teclado te= new Teclado();
        /**
         * Llamamos a los setters y ponemos sus parámetros.
         */
            pre.setPrecio(693f);
            pro.setVelocidad(480);
            mo.setPulgada(18.9f);
            te.setMarca("Sus");
        /**
         * Estos parámetros serán llamados con un System.out.println.
         */
        System.out.println("Os datos da PC:\n"+pro.toString()+"\n"+mo.toString()+"\n"+te.toString()+"\n"+pre.toString());
    }
}
