import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();

        var salir = false;

        while (!salir) {
            mostrarMenu();
            try {
                salir = ejecutarOperacion(consola, personas);

            } catch (Exception ex) {
                System.out.println("Ocurrió un error: " + ex.getMessage());
            }
            System.out.println();
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
                ***** Listado de Personas
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Opción proporcionada: ");
    }

    public static boolean ejecutarOperacion(Scanner consola, List<Persona> personas) {
        var opcion = Integer.parseInt(consola.nextLine());
        var salir = false;
        switch (opcion) {
            case 1 -> {
                System.out.print("Proporciona el Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Proporciona el Teléfono: ");
                var tel = consola.nextLine();
                System.out.print("Proporciona el Email: ");
                var email = consola.nextLine();
                var persona = new Persona(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " personas");
            }
            case 2 -> {
                System.out.println("Listado de Personas: ");
                // personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            }
            case 3 -> {
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opción errónea: " + opcion);
        }
        return salir;
    }
}
