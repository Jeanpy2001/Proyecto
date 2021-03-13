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
   private String cedula;
   

    public ClasePersona(String nombre, String apellido, String NumeroIdentidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = NumeroIdentidad;
        
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    //public abstract void CalcularFactura();

    @Override
    public String toString() {
        return "ClasePersona{" + "nombre=" + nombre + ", apellido=" + apellido + ", NumeroIdentidad=" + cedula +  '}';
    }
    
    public boolean esValida(){
        int verificacion=0;
        int[] num = new int[10];
        String cedula;
        cedula= this.cedula;
        if(cedula.length()==10){
            char[] id= cedula.toCharArray();
            for (int i=0 ; i<10 ; i++){
               num[i] = Character.getNumericValue(id[i]);  
            }                   
            int suma=0;
            int i=0,j=1;
            int sum1, sum2;
            while(i<9){
                sum1 = num[i]*2;
                if(sum1>=10){
                   sum1=sum1-9;
                }
                suma=suma+sum1;
                i=i+2;          
            }
            while(j<8){
                sum2 = num[j]*1;
                if(sum2>=10){
                   sum2=sum2-9;
                }
                suma=suma+sum2;
                j=j+2;          
            }  
        
        verificacion = 10 - (suma%10);
        
    }
    return verificacion==num[9];
    }    
 
    
}
