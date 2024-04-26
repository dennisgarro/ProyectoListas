import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Empleados> empleados = new LinkedList<>();
        for (int i = 0; i < 3; i++) {
            Empleados item = new Empleados(null, null, null, i, null);
            System.out.println("Ingrese el nombre");
            item.setNombre(sc.next());
            System.out.println("Ingrese el apellido");
            item.setApellido(sc.next());
            System.out.println("Ingrese la direccion");
            item.setDireccion(sc.next());
            System.out.println("Ingrese la edad ");
            item.setEdad(sc.nextInt());
            System.out.println("Ingrese el cargo");
            item.setCargo(sc.next());
            empleados.add(item);
        }
        String cadena = "";
        for (Empleados empleado : empleados) {
            cadena = cadena + " \n" + empleado.getNombre() + "\n" + empleado.getApellido() + "\n" +
                    empleado.getDireccion() + "\n" + empleado.getEdad() + "\n" + empleado.getCargo() + "\n";

        }
        System.out.println(cadena);
    }
}