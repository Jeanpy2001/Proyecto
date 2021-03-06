/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupalfinal;

/**
 *
 * @author User
 */
public  class  ClasePersona  {
    
   private String nombre;
   private String apellido;
   private int NumeroIdentidad;
   

    public ClasePersona(String nombre, String apellido, int NumeroIdentidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.NumeroIdentidad = NumeroIdentidad;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroIdentidad() {
        return NumeroIdentidad;
    }

    public void setNumeroIdentidad(int NumeroIdentidad) {
        this.NumeroIdentidad = NumeroIdentidad;
    }
    
    //public abstract void CalcularFactura();

    @Override
    public String toString() {
        return "ClasePersona{" + "nombre=" + nombre + ", apellido=" + apellido + ", NumeroIdentidad=" + NumeroIdentidad +  '}';
    }
    
 
    
}
