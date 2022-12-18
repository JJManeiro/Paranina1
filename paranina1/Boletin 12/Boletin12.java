/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin12;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Boletin12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p1 = Integer.parseInt(JOptionPane.showInputDialog("Dale el numero al enemigo."));
        int p2 =0;
        int intento = Integer.parseInt(JOptionPane.showInputDialog("Cuantas intentas?"));
        for (int i=0;i<=intento;i++){
            p2 = Integer.parseInt(JOptionPane.showInputDialog("Inserta"));
            if ((p2<0)||(p2>50)){
                JOptionPane.showMessageDialog(null,"Es del 1 al 50 eso no vale."); 
                break;
            }
            else if (p2>p1){
            JOptionPane.showMessageDialog(null,"Es un numero menor");    
            }
            else if (p2<p1){
            JOptionPane.showMessageDialog(null,"Es un numero mayor");    
            }
            else{
                JOptionPane.showMessageDialog(null,"Enhorabuena!");
                break;
            }
        }
        if (p2!=p1)
        JOptionPane.showMessageDialog(null,"Mas suerte la proxima vez.");
    }
}
