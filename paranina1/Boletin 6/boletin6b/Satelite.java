/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6b;

import java.util.HashSet;

/**
 *
 * @author dam1
 */
public class Satelite {
     private double meridiano ;
     private double paralelo;
     private double distanciaTerra ;

 public Satelite ( ) {

  meridiano = paralelo = distanciaTerra = 0;
}

public Satelite (double m,double p,double d){

meridiano = m;
paralelo = p;
distanciaTerra = d;

}
public double Meridiano (){
    return meridiano;
}
public void setMeridiano(double meridiano){
    this.meridiano = meridiano;
}
public double Paralelo(){
    return paralelo;
}
public void setParalelo(double paralelo){
    this.paralelo = paralelo;
}
public double Distancia(){
    return distanciaTerra;
}
public void setDistancia(double distanciaTerra){
    this.distanciaTerra = distanciaTerra;
} 

public void Locacion(){
    System.out.println("Locación: \n M: "+meridiano+"\n P: "+paralelo+"\n D: "+distanciaTerra);
}
public void verPosicion ( ){
System.out.println ("o satelite atopase  no paralelo "+paralelo+" meridiano "+meridiano+" a unha distancia da terra "+distanciaTerra);
}
}