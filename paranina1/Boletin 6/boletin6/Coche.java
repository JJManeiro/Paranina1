/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin6;

/**
 *
 * @author dam1
 */
public class Coche {
    private int velocidade;

  public Coche(int velocidade){
      this.velocidade = velocidade;
    }
    public int getVelocidade(){
        return velocidade;
    }
    public void Acelerar(int valor){
        velocidade =velocidade+valor;
    }
    public void Frenar(int menos){
        velocidade =velocidade-menos;
    }
}
