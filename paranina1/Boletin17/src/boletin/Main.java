package boletin;

import javax.swing.JOptionPane;

public class Main {
    public static double InTeoria() {
        double t1 = Double.parseDouble(JOptionPane.showInputDialog("Que sacaste aquí?"));
        double t2 = Double.parseDouble(JOptionPane.showInputDialog("Que sacaste acá?"));
        double teoria = ((t1+t2)/2)*0.4;
        return teoria;
    }
    public static double InPractica () {
        double pr = Double.parseDouble(JOptionPane.showInputDialog("Que sacaste aquí?"));
        double practica = pr * 0.4;
        return practica;
    }
    public static double InBoletines (){
        int bt = Integer.parseInt(JOptionPane.showInputDialog("Cuantos son en total?"));
        int be = Integer.parseInt(JOptionPane.showInputDialog("Cuantos diste?"));
        double boletines = be*100/bt;
        System.out.println(boletines);
        if (boletines >= 90)
            return 2;
        else if (boletines>=70 && boletines<90)
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) {

        System.out.println("Quieres saber tu nota?");
        String SN;
        do {
            SN =  JOptionPane.showInputDialog("Quieres saber tu nota?");
            if (SN.toUpperCase().equals("S")) {
                double Teoria = Math.round(InTeoria());
                System.out.println("Teoria: "+Teoria);
                double Practica = Math.round(InPractica());
                System.out.println("Practica: "+Practica);
                double Tareas = Math.round (InBoletines());
                System.out.println(Tareas);
                double Nota = Math.round(Teoria+Practica+Tareas);
                System.out.println("Nota final: "+Nota);
            }
        }
        while ( SN.toUpperCase().equals("S"));
    }
}