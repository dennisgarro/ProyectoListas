import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Empleados> empleados = new LinkedList<>();
        ModificarEdad me = new ModificarEdad();
        for (int i = 0; i < 3; i++) {
            Empleados item = new Empleados(null, null, null, i, null);
            System.out.println("Ingrese el Nombre");
            item.setNombre(sc.next());
            System.out.println("Ingrese el Apellido");
            item.setApellido(sc.next());
            System.out.println("Ingrese la Direccion");
            item.setDireccion(sc.next());
            System.out.println("Ingrese la Edad ");
            item.setEdad(sc.nextInt());
            System.out.println("Ingrese el Cargo");
            item.setCargo(sc.next());
            empleados.add(item);
        }

        empleados = me.Edad(empleados);
        MostrarLista ml = new MostrarLista();
        System.out.println(ml.mostrarLista(empleados));
        System.out.println("estoy frio profe");
    }
}