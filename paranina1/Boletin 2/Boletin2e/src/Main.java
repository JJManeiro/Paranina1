import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double millas , metros;
        Scanner obx = new Scanner(System.in);
        System.out.println("Cuantas millas quieres medir?");
        millas = obx.nextDouble();
        metros = millas * 1852;
        System.out.println("La cantidad de metros es de: "+metros);
    }
}