package Persona;

public class Persoa {

    private String telefono;
    private String correo;

    public Persoa (){

    }
    public Persoa(String telf,String Email){
        telefono = telf;
        correo = Email;
    }
    public void setTelf(String telf){
        this.telefono=telf;
    }
    public String getTelf(){
        return telefono;
    }
    public void setEmail(String email){
        this.correo=email;
    }
    public String getEmail(){
        return correo;
    }
    public String toString() {
        return "\n telefono:"+telefono+"\n correo:"+correo;
    }
}
