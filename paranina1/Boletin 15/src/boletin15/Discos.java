/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin15;

/**
 *
 * @author dam1
 */
public class Discos extends Multimedia {
    private String xenero;
    public Discos() {
        super();
    }

    public Discos(String xenero, String titD, String autD, String formatD, float duraD) {
        super(titD, autD, formatD, duraD);
        this.xenero = xenero;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    @Override
    public String toString() {
        return (super.toString())+"Discos{" + "xenero=" + xenero + '}';
    }
    
}
