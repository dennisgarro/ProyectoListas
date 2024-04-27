import java.util.LinkedList;

public class MostrarLista 
{
    public String mostrarLista(LinkedList<Empleados> empleados)
    {
        String cadena = "";
        for (Empleados employee : empleados) {
            cadena = cadena + "[" + employee.getNombre() + "]" + "[" + employee.getApellido() + "]" + "[" + employee.getEdad() + "]" + "[" + employee.getDireccion() + "]" + "[" + employee.getCargo() + "]" + "\n";

        }
        return cadena;
    }
}
