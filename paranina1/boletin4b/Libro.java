/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin4b;

/**
 *
 * @author dam1
 */
public class Libro {
    private String titulo,autor;
    private int ano;
    private short paginas;
    private float valoracion;
    /**
     */
    public Libro (String titulo, String autor,int ano,short paginas,float valoracion){
      this.titulo = titulo;
      this.autor = autor;
      this.ano = ano;
      this.paginas = paginas;
      this.valoracion = valoracion;
    }
    public Libro(){
        
    }
    public String getTitulo(){
       return titulo; 
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public int getAno(){
        return ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public short getPaginas(){
        return paginas;
    }
    public void setPaginas(short paginas){
        this.paginas = paginas;
    }
    public float getValoracion(){
        return valoracion;
    }
    public void setValoracion(float valoracion){
        this.valoracion = valoracion;
    }
    public void mostrar (){
        System.out.println("Datos:"+titulo+","+autor+","+ano+","+paginas+","+valoracion);
    }      
}
