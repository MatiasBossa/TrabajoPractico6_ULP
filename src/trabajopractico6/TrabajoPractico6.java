/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico6;

import clases.*;
import static java.lang.Math.random;
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
        Cliente c = new Cliente(295432049,"Matias","Bossa","San Luis","Marcelino Poblet 1273");
        Cliente c1 = new Cliente(295432047,"Matias","Bossa","La Pampa","Marcelino Poblet 1273");
        Cliente c24 = new Cliente(295432048,"Matias","Valverde","San Luis","Marcelino Poblet 1273");
        
        DirectorioTelefonico dt = new DirectorioTelefonico();
        
        List<Cliente> clientes = new ArrayList<Cliente>();
        
        dt.agregarCliente(c);
        dt.agregarCliente(c1);
        dt.agregarCliente(c24);
        
        dt.mostrarListado();
        
        dt.borrarCliente(295432047);
        
        System.out.println("---------------------------------");
        
        dt.mostrarListado();
        
       
    }
    
}