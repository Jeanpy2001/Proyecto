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
public  class ClaseCliente extends ClasePersona{

    private int edad;

    public ClaseCliente(int edad, String nombre, String apellido, int NumeroIdentidad, double factura) {
        super(nombre, apellido, NumeroIdentidad);
        this.edad = edad;
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    
    @Override
    public String toString() {
        return "Datos del Cliente es :" +super.toString()+"edad=" + edad ;
    }

    
}
