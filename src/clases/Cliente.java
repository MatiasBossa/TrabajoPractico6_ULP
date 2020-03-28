/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Matias Bossa Valverde
 */
public class Cliente {
    
    private int nroTelefonico;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String direccion;
    
    public Cliente() {
     
    }

    public Cliente(int nroTelefonico, String nombre, String apellido, String ciudad, String direccion) {
        this.nroTelefonico = nroTelefonico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    
    public Cliente(Cliente client){
        this.nroTelefonico = client.nroTelefonico;
        this.nombre = client.getNombre();
        this.apellido = client.getApellido();
        this.ciudad = client.getCiudad();
        this.direccion = client.getDireccion();
    }

    public int getNroTelefonico() {
        return nroTelefonico;
    }

    public void setNroTelefonico(int nroTelefonico) {
        this.nroTelefonico = nroTelefonico;
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

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String mostrar() {
        return "Cliente{\n " + "NroTelefonico = " + nroTelefonico + ",\n Nombre = " + nombre + ",\n Apellido = " + apellido + ",\n Ciudad = " + ciudad + ",\n Direccion = " + direccion + "\n}";
    }
    
    
    
    
    
}
