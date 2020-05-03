
package clases;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/**
 *
 * @author Matias Bossa Valverde
 */
public class DirectorioTelefonico2 {
    
    private TreeMap<Long, Cliente2> clientes = new TreeMap<>();
    

    public boolean agregarCliente(long nroTelefonico,Cliente2 cliente){
        
            if(clientes.putIfAbsent(nroTelefonico, cliente) != null){
                return false;
            }
            
            return true;
    }
    
    
    public Cliente2 buscarCliente(long nro){ return clientes.get(nro); }
    
    
    public Set<Cliente2> buscarTelefono(String apellido){
        Set<Cliente2> aux = new HashSet<>();
        for(Map.Entry<Long, Cliente2> entry : clientes.entrySet()){
            if( entry.getValue().getApellido().equals(apellido) ){
                aux.add(entry.getValue());
            }
        }
        return aux;
    }
    
    public Set<Cliente2> buscarClientes(String ciudad){
        Set<Cliente2> aux = new HashSet<>();
        for(Map.Entry<Long, Cliente2> entry : clientes.entrySet()){
            if( entry.getValue().getCiudad().equals(ciudad) ){
                aux.add(entry.getValue());
            }
        }
        return aux;
    }
    
    public boolean borrarCliente(long dni){
        for(Map.Entry<Long, Cliente2> entry : clientes.entrySet()){
            Cliente2 item = entry.getValue();
            if(item.getDni() == dni){
                return clientes.remove(entry.getKey(), entry.getValue());           
            }
        }
        return false;
    }
    
    
    public void mostrarListado(){
        for(Map.Entry<Long, Cliente2> entry : clientes.entrySet()){
            System.out.print("Numero Telefonico: "+entry.getKey());
            System.out.println(", Cliente: "+entry.getValue().mostrar());
        }
    }    

}
