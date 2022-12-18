/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin15;

/**
 *
 * @author dam1
 */
public class Peliculas extends Multimedia {
    private String actorP;
    private String actrizP;

    public Peliculas() {
        super();
    }

    public Peliculas(String actorP, String actrizP, String titP, String autP, String formatP, float duraP) {
        super(titP, autP, formatP, duraP);
        this.actorP = actorP;
        this.actrizP = actrizP;
    }

    public String getActorP() {
        return actorP;
    }

    public void setActorP(String actorP) {
        this.actorP = actorP;
    }

    public String getActrizP() {
        return actrizP;
    }

    public void setActrizP(String actrizP) {
        this.actrizP = actrizP;
    }

    @Override
    public String toString() {
        return (super.toString())+"Peliculas{" + "actorP=" + actorP + ", actrizP=" + actrizP + '}';
    }
    
}
