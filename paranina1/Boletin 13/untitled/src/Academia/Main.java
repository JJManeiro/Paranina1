package Academia;

import Persona.Persoa;

public class Main {
    public static void main(String[] args) {
    Persoa P = new Persoa("12343","Ayin's Email");
    Academica A = new Academica("Ayin",6,P);
    A.validar();
        System.out.println(A.toString()+P.toString());
    }
}
