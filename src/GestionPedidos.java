import java.util.Scanner;

/**
 * Clase de control que coordina las dos pilas manuales (Principal y Secundaria)
 * y gestiona la interfaz de consola del usuario.
 */
public class GestionPedidos {
    private PilaManual pilaPrincipal;  // Historial activo (Undo)
    private PilaManual pilaSecundaria; // Historial deshecho (Redo)
    private Scanner scanner;

    public GestionPedidos() {
        this.pilaPrincipal = new PilaManual();
        this.pilaSecundaria = new PilaManual();
        this.scanner = new Scanner(System.in);
    }

    public void iniciarMenu() {
        int opcion = -1;
        do {
            System.out.println("\n=== PIZZA-TRACK SYSTEM ===");
            System.out.println("1. Registrar Pizza (Escribir)");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar Pedido Actual (Tope)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            
            try {
                opcion = Integer.parseInt(scanner.nextLine());
                procesarOpcion(opcion);
            } catch (NumberFormatException e) {
                System.out.println(" Error: Por favor, ingrese un número válido.");
            }
        } while (opcion != 0);
    }

    private void procesarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                registrarPizza();
                break;
            case 2:
                deshacer();
                break;
            case 3:
                rehacer();
                break;
            case 4:
                mostrarPedidoActual();
                break;
            case 0:
                System.out.println("¡Gracias por usar Pizza-Track! Saliendo del sistema...");
                break;
            default:
                System.out.println(" Opción no válida. Intente de nuevo.");
        }
    }

    private void registrarPizza() {
        System.out.print("Ingrese el nombre de la pizza: ");
        String nombre = scanner.nextLine();
        
        String[] ingredientes = new String[3];
        System.out.println("Ingrese obligatoriamente 3 ingredientes:");
        for (int i = 0; i < 3; i++) {
            System.out.print("  Ingrediente " + (i + 1) + ": ");
            ingredientes[i] = scanner.nextLine();
        }

        Pizza nuevaPizza = new Pizza(nombre, ingredientes);
        pilaPrincipal.push(nuevaPizza);
        
        // Al registrar una nueva acción, se debe limpiar el historial de Redo
        while (!pilaSecundaria.isEmpty()) {
            pilaSecundaria.pop();
        }
        
        System.out.println(" Pedido registrado con éxito: " + nuevaPizza.getNombre());
    }

    private void deshacer() {
        if (pilaPrincipal.isEmpty()) {
            System.out.println(" No hay pedidos para deshacer.");
            return;
        }
        // Pop de la principal -> Push a la secundaria
        Pizza pizzaDeshecha = pilaPrincipal.pop();
        pilaSecundaria.push(pizzaDeshecha);
        System.out.println(" Deshecho: Se eliminó temporalmente el pedido -> " + pizzaDeshecha.getNombre());
    }

    private void rehacer() {
        if (pilaSecundaria.isEmpty()) {
            System.out.println(" No hay pedidos recientes deshechos para recuperar.");
            return;
        }
        // Pop de la secundaria -> Push a la principal
        Pizza pizzaRecuperada = pilaSecundaria.pop();
        pilaPrincipal.push(pizzaRecuperada);
        System.out.println(" Rehecho: Se recuperó el pedido -> " + pizzaRecuperada.getNombre());
    }

    private void mostrarPedidoActual() {
        Pizza actual = pilaPrincipal.peek();
        if (actual == null) {
            System.out.println(" La cola de producción está vacía. No hay pedidos activos.");
        } else {
            System.out.println("\n [PRODUCCIÓN ACTUAL] ");
            System.out.println(actual);
        }
    }

    public static void main(String[] args) {
        GestionPedidos app = new GestionPedidos();
        app.iniciarMenu();
    }
}

