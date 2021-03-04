/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogrupalfinal;

/**
 *
 * @author Syslan
 */
public class Factura {
    private double pago;
    private double pagoFinalConIva;
    private Persona datosCliente;
    //actualizado

    public Persona getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(Persona datosCliente) {
        this.datosCliente = datosCliente;
    }
    
    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getPagoFinalConIva() {
        return pagoFinalConIva;
    }

    public void setPagoFinalConIva(double pagoFinalConIva) {
        this.pagoFinalConIva = pagoFinalConIva;
    }

    @Override
    public String toString() {
        return "Factura{" + "pago=" + pago + ", pagoFinalConIva=" + pagoFinalConIva + ", datosCliente=" + datosCliente + '}';
    }
    
}

