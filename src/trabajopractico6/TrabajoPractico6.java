/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico6;

import clases.Cliente2;
import clases.DirectorioTelefonico2;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author matia
 */
public class TrabajoPractico6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente2 c = new Cliente2("Matias","Bossa",38295251,"San Luis","Marcelino Poblet 1273");
        Cliente2 c1 = new Cliente2("Matias","Bossa",38295252,"La Pampa","Marcelino Poblet 1273");
        Cliente2 c24 = new Cliente2("Matias","Valverde",38295253,"San Luis","Marcelino Poblet 1273");
        Cliente2 c11 = new Cliente2("Matias","Bossa",38295254,"La Pampa","Marcelino Poblet 1273");
        DirectorioTelefonico2 dt = new DirectorioTelefonico2();
        
        
        System.out.println(dt.agregarCliente(295432047, c1));
        System.out.println(dt.agregarCliente(295432047, c));
        System.out.println(dt.agregarCliente(295432049, c24));
        System.out.println(dt.agregarCliente(295432043, c11));
        

        
        dt.mostrarListado();
        System.out.println("");
        System.out.println(dt.borrarCliente(38295258));
        System.out.println("");
        dt.mostrarListado();
        /*
        Set<Cliente2> aux = new HashSet<>();
        
        aux = dt.buscarClientes("La Pampa");
        for(Cliente2 it : aux){
            System.out.println(it.mostrar());
        }/*
        /*
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
        */
       
    }
    
}
