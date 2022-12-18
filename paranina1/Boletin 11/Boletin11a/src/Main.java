public class Main {
    public static void main(String[] args) {
        int i = 0, numero = 0, c1 = 0, c2 = 0, c3 = 0;
        for (i = 0; i < 10; i++) {
            numero = (int) ((Math.random() * (10 + 10) - 10));
            System.out.print(numero + ",");
            if (numero < 0) {
                c1 = c1 + 1;
            } else if (numero > 0) {
                c2 = c2 + 1;
            } else {
                c3 = c3 + 1;
            }
        }
    }
}