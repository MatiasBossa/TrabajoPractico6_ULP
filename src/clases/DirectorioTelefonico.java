
package clases;

import java.util.*;
/**
 *
 * @author Matias Bossa Valverde
 */
public class DirectorioTelefonico {
    
    private List<Cliente> clientes = new ArrayList<Cliente>();
    
    public void agregarCliente(Cliente cliente){
        boolean exist = false;
        for(Cliente client : clientes){
            if(client.getNroTelefonico() == cliente.getNroTelefonico()){
                exist = true;
            }
        }
        
        if(!exist){
            clientes.add(cliente);
        }else{
            System.out.println("Ya existe un cliente con este Nro Telefonico");
        }
          
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
    
    public List<Cliente> buscarTelefono(String apellido){
        List<Cliente> aux = new ArrayList<Cliente>();
        for(Cliente client : clientes){
            if(client.getApellido().equals(apellido)){
                aux.add(client);
            }
        }
        return aux;
    }
    
    public List<Cliente> buscarClientes(String ciudad){
        List<Cliente> aux = new ArrayList<Cliente>();
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
        }
    }
    
}
