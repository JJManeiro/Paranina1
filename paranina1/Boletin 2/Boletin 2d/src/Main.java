import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double num1, num2;
        Scanner obx = new Scanner (System.in);
        System.out.println("Dame un numero");
        num1 = obx.nextDouble();
        System.out.println("Dame outro");
        num2 = obx.nextDouble();
        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;
        double division = num1 / num2;
        System.out.println("Resultados:"+"\n Suma: "+suma+"\n Resta: "+resta+"\n Multiplicación: "+multiplicacion+"\n División: "+division);
    }
}