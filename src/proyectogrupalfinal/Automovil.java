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
public class Automovil {
    
    private String modelo;
    private String tipo;
    private String marca;
    private int presio;
    private int anio;
    private int kilometraje;

    public Automovil(String modelo, String tipo, String marca, int presio, int anio, int kilometraje) {
        this.modelo = modelo;
        this.tipo = tipo;
        this.marca = marca;
        this.presio = presio;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPresio() {
        return presio;
    }

    public void setPresio(int presio) {
        this.presio = presio;
    }

    public int getAño() {
        return anio;
    }

    public void setAño(int año) {
        this.anio = año;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Información{" + "modelo: " + modelo + ", tipo: " + tipo + ", marca: " + marca + ", presio: " + presio + ", año:" + anio + ", kilometraje: " + kilometraje + '}';
    }
    
    
      
}
