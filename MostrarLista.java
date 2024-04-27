import java.util.LinkedList;

public class MostrarLista 
{
    public String mostrarLista(LinkedList<Empleados> empleados)
    {
        String cadena = "";
        for (Empleados empleado : empleados) {
            cadena = cadena + " \n" + empleado.getNombre() + "\n" + empleado.getApellido() + "\n" +
                    empleado.getDireccion() + "\n" + empleado.getEdad() + "\n" + empleado.getCargo() + "\n";

        }
        return cadena;
    }
}
