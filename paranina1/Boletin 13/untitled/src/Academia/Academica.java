package Academia;
import Persona.Persoa;
import java.util.Scanner;
public class Academica {

    public static int numReferencia = 2018;
    private String nome;
    private int nota;
    private Persoa alum;
    public Academica() {
    }
    public Academica (String nome , int nota, Persoa alum){
        numReferencia++;
        this.nome = nome;
        this.nota = nota;
        this.alum = alum;
    }
    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

    public int getGrade() {
        return nota;
    }

    public void setGrade(int nota) {
        this.nota = nota;
    }

    public String toString() {
        return "nome:" + nome + "\n nota:" + nota + "\n alumno:"+numReferencia;
    }

    public Persoa getAlum() {
        return alum;
    }

    public void setAlum(Persoa alum) {
        this.alum = alum;
    }

    public int validar() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Entre 1 e 10");
            nota = sc.nextInt();
        }
        while (nota < 0 || nota > 10);
        return nota;
    }
}
