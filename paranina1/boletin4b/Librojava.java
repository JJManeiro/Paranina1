
import boletin4b.Libro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dam1
 */
public class Librojava {
    
    public static void main(String[]args){
        Libro extra2 = new Libro("Jigoku no sukurin","Ryoushu",1693,(short)111,7.5F);
        Libro extra = new Libro();
        extra.setTitulo("Nuevo libro");
        extra.setAutor("Autor");
        extra.setAno(1999);
        extra.setPaginas((short)111);
        extra.setValoracion(6.9F);
        extra.mostrar();
        extra2.mostrar();
        }
}
