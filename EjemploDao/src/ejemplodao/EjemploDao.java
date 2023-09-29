package ejemplodao;

import Dao.PersonaDaoIMP;
import Model.Persona;
import java.util.Scanner;

/**
 *
 * @author HP proO0
 */
public class EjemploDao {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int x;

        System.out.println("1.Consultar todo");
        System.out.println("2.Buscar por id");
        System.out.println("3.Agregar persona");
        System.out.println("4.BOrrar todo");
        System.out.println("5.Borrar id");
        System.out.println("6.Actualizar");
        System.out.println("Escoja una opcion");
        x = leer.nextInt();

        switch (x) {
            case 1:
               
                PersonaDaoIMP consul = new PersonaDaoIMP();
                consul.ConsultarTodo("datos.txt");
               
                break;

            case 2:
                PersonaDaoIMP busc = new PersonaDaoIMP();
                busc.BuscarPorId("datos.txt", 1);
                break;

            case 3:
                PersonaDaoIMP agre = new PersonaDaoIMP();
                Persona nuevaPersona = new Persona(4, "fernando", 35);
                agre.AgregarPersona("datos.txt", nuevaPersona);
                
                break;

            case 4:
                PersonaDaoIMP borr = new PersonaDaoIMP();
                borr.BorrarTodo("datos.txt");
                String nombreArchivo = "datos.txt";
                boolean borradoExitoso = borr.BorrarTodo(nombreArchivo);
                if (borradoExitoso) {
                    System.out.println("Se ha borrado todo el contenido del archivo: " + nombreArchivo);
                }

                break;

            case 5:

                break;

            case 6:

                break;
        }

    }


}
