package b5;

public class Consumo {
    float vmedia,lit;
    double pgas,km;
public Consumo (){
}

    public Consumo(float vmedia, float lit, double pgas, double km) {
        this.vmedia = vmedia;
        this.lit = lit;
        this.pgas = pgas;
        this.km = km;
    }

    public float getvmedia() {
        return vmedia;
    }

    public void setvmedia(float vmedia) {
        vmedia = vmedia;
    }

    public float getLit() {
        return lit;
    }

    public void setLit(float lit) {
        this.lit = lit;
    }

    public double getPgas() {
        return pgas;
    }

    public void setPgas(double pgas) {
        this.pgas = pgas;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
    public float consumomedio(){
        return (float) ((lit*100)/km);
    }
    public float euros(){
        return (float) (lit*pgas);
    }
    public float tempo(){
        return (float) (vmedia/km);
    }
}


