package b5;

public class Main {
    public static void main(String[] args) {
    Consumo C = new Consumo ();
    Consumo C2 = new Consumo(42.1f,30f,1.78,200);
    C.setLit(50f);
    C.setPgas(1.57f);
        System.out.println(C2.consumomedio()+" litros");
        System.out.println(C2.euros()+" euros.");
        System.out.println(C2.tempo()+" horas");
    }
}