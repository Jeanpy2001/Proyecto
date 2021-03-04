/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupalfinal;

/**
 *
 * @author David Andres
 */
public class ClaseEmpleado extends ClasePersona {
    private String codigo;

    public ClaseEmpleado(String codigo, String nombre, String apellido, int NumeroIdentidad ) {
        super(nombre, apellido, NumeroIdentidad);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Datos del Empleado es:" +super.toString()+ "codigo=" + codigo + '}';
    }
    
    
    
    
    
    
    
    
}
