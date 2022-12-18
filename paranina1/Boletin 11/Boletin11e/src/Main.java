import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        int salario;
        int empT = 0,emp = 0, mil =0;

        do {

            salario = Integer.parseInt(JOptionPane.showInputDialog("Introduzca su salario"));

            if (salario >= 0 && salario <=1750) {

                if (salario == 0) {
                    break;
                } else if (salario < 1000) {
                    emp++;
                } else if (salario >= 1000) {
                    mil++;
                }
                empT++;
            }
            else if (salario<0) {
                System.out.println("No hay sueldos negativos");
            }
            if (salario>1750) {
                System.out.println("Se sale de rango.");
            }
        } while (salario != 0);
        System.out.println("Empleados de menos de mil euros: " + (emp * 100) / empT + "%");
        System.out.println("Empleados de menos de mil euros: " + emp);
        System.out.println("Mileuristas: " + (mil * 100) / empT + "%");
        System.out.println("Mileuristas: " + mil);
    }
}