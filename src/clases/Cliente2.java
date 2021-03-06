/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Objects;

/**
 *
 * @author Matias Bossa Valverde
 */
public class Cliente2 {
    
    private String nombre;
    private String apellido; 
    private long dni;
    private String ciudad;
    private String direccion;
    
    public Cliente2() {
     
    }

    public Cliente2(String nombre, String apellido, long dni, String ciudad, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }
    
    public Cliente2(Cliente2 client){
        this.nombre = client.getNombre();
        this.apellido = client.getApellido();
        this.dni = client.getDni();
        this.ciudad = client.getCiudad();
        this.direccion = client.getDireccion();
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

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
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
        return "Cliente{ " + "Nombre = " + nombre + ", Apellido = " + apellido +", DNI = "+ dni +", Ciudad = " + ciudad + ",  Direccion = " + direccion + " }";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.apellido);
        hash = 53 * hash + (int) (this.dni ^ (this.dni >>> 32));
        hash = 53 * hash + Objects.hashCode(this.ciudad);
        hash = 53 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente2 other = (Cliente2) obj;
        if (this.dni != other.dni) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        return true;
    }
    
    

    

   

    

    

    
    
    
    
}
