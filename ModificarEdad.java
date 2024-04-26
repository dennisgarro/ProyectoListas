import java.util.LinkedList;

public class ModificarEdad {
    public LinkedList<Empleados> Edad(LinkedList<Empleados> empleados) {
        for (Empleados item : empleados) {
            if (item.getEdad() < 18) {
                item.setEdad(15);
            } else {
                item.setEdad(20);
            }
        }
        return empleados;
    }

}
