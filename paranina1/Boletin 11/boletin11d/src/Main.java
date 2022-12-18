import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int n;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));
            if (n != 0) {

                for (int i = 1; i <= 10; i++) {

                    System.out.println(n + " * " + i + " = " + (n * i));
                }
            }

        } while (n != 0);
    }
}