/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico6;

import clases.*;
import java.util.*;
/**
 *
 * @author matia
 */
public class TrabajoPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente(295432047,"Matias","Bossa","San Luis","Marcelino Poblet 1273");
        Cliente c1 = new Cliente(295432047,"Matias","Bossa","La Pampa","Marcelino Poblet 1273");
        Cliente c24 = new Cliente(295432049,"Matias","Bossa","San Luis","Marcelino Poblet 1273");
        Cliente c11 = new Cliente(295432043,"Matias","Bossa","La Pampa","Marcelino Poblet 1273");
        
        DirectorioTelefonico dt = new DirectorioTelefonico();
        HashSet<Cliente> listado = new HashSet<Cliente>();
        
        dt.agregarCliente(c);
        dt.agregarCliente(c1);
        dt.agregarCliente(c11);
        dt.agregarCliente(c24);
        
        
        listado = dt.buscarClientes("San Luis");
        
        for(Cliente cs : listado){
            System.out.println(cs.mostrar());
            System.out.println("");
        }
        
        System.out.println("---------------------------------");
        
        listado = dt.buscarTelefono("Bossa");
        
        for(Cliente cs : listado){
            System.out.println(cs.mostrar());
            System.out.println("");
        }
        
        System.out.println("---------------------------------");
        
        dt.mostrarListado();
        
       
    }
    
}
