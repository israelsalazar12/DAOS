package Dao;

import Model.Persona;




/**
 *
 * @author HP pro
 */
public interface PersonaDao {
    
    
    
    public void ConsultarTodo(String nombreArchivo);
    public void BuscarPorId(String nombreArchivo, int idABuscar);
     public  void AgregarPersona(String nombreArchivo, Persona persona);
    public boolean BorrarTodo(String nombreArchivo); 

    
}
