import java.util.Arrays;

/**
 * Representa el modelo de datos de una Pizza.
 * Utiliza un arreglo de tamaño fijo (3) para los ingredientes.
 */
// CONSTRUCTOR //
public class Pizza {
    private String nombre;
    private String[] ingredientes; // Arreglo fijo de tamaño 3

    public Pizza(String nombre, String[] ingredientes) {
        this.nombre = nombre; //guarda el texto que identifica la pizza
        // Se asegura de que el arreglo siempre sea de tamaño 3
        this.ingredientes = new String[3];
        for (int i = 0; i < 3 && i < ingredientes.length; i++) { //Aqui se ingresan uno a uno los ingredientes
            this.ingredientes[i] = ingredientes[i];
        }
    }
// METODOS DE ACCESO //
    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

//FORMATEO DE SALIDA //

    @Override
    public String toString() {
        return "Pizza: '" + nombre + "' | Ingredientes: " + Arrays.toString(ingredientes);
    }
}

