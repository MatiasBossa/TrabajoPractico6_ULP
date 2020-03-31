
package clases;

import java.util.*;
/**
 *
 * @author Matias Bossa Valverde
 */
public class DirectorioTelefonico {
    
    private HashSet<Cliente> clientes = new HashSet<Cliente>();
    
    public void agregarCliente(Cliente cliente){
            clientes.add(cliente);
                    
    }
    
    public Cliente buscarCliente(int nro){
        Cliente aux = new Cliente();
        for(Cliente client : clientes){
            if(client.getNroTelefonico() == nro){
                aux = client;
            }
        }
        return aux;
    }
    
    public HashSet<Cliente> buscarTelefono(String apellido){
        HashSet<Cliente> aux = new HashSet<Cliente>();
        for(Cliente client : clientes){
            if(client.getApellido().equals(apellido)){
                aux.add(client);
            }
        }
        return aux;
    }
    
    public HashSet<Cliente> buscarClientes(String ciudad){
        HashSet<Cliente> aux = new HashSet<Cliente>();
        for(Cliente client : clientes){
            if(client.getCiudad().equals(ciudad)){
                aux.add(client);
            }
        }
        return aux;
    }
    
    public void borrarCliente(int nro){
        
        clientes.remove(this.buscarCliente(nro));
        
    }
    
    public void mostrarListado(){
        for(Cliente client: clientes){
            System.out.println(client.mostrar());
            System.out.println("");
        }
    }
    
}
