import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        float num=0,num2=0;
        do {
            num = Float.parseFloat(JOptionPane.showInputDialog("base?"));
            num2 = Float.parseFloat(JOptionPane.showInputDialog("altura?"));
            float triangulo = (num*num2)/2;
            if (num>0 && num2>0) {
                System.out.println("el area es: "+triangulo);
                break;
            }
            else if ( num<0 && num2<0)
            System.out.println("dame un positivo");
        }
        while (num!=0 && num2!=0);
    }
}