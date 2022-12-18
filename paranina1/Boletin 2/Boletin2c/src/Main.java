import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double euros , conversion;
        Scanner obx = new Scanner(System.in);
        System.out.println("Cuantos euros quieres darme?");
        euros = obx.nextDouble();
        conversion = euros * 1.06;
        System.out.println("La conversion de euros a dolar es de: "+conversion);
    }
}