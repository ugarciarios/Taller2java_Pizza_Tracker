/**
 * Implementación de una estructura de datos Pila (LIFO) desde cero
 * basada en una lista ligada simple.
 * usando la clase Nodo para almacenar objetos Pizza.
 */
public class PilaManual {
    private Nodo tope; // Puntero al elemento superior de la pila

    public PilaManual() {
        this.tope = null; // Inicialmente la pila está vacía
    }

    /**                     // METODO PUSH //
     * Inserta un objeto Pizza en el tope de la pila.
     */
    public void push(Pizza pizza) {
        Nodo nuevoNodo = new Nodo(pizza); //se crea el contenedor
        // El nuevo nodo apunta al antiguo tope, colocándose arriba
        nuevoNodo.siguiente = tope; // Se apunta al antiguo tope
        // El puntero 'tope' se actualiza para referenciar al nuevo nodo superior
        tope = nuevoNodo; // El nuevo nodo es el nuevo tope
    }

    /**                    // METODO POP //
     * Retira el objeto del tope de la pila y devuelve su contenido.
     */
    public Pizza pop() {
        if (isEmpty()) {
            return null;
        } // Validación de pila vacía
        // Guardamos la pizza del nodo que vamos a eliminar
        Pizza pizzaRetornar = tope.pizza; // salvamos la informacion
        // Desplazamos el puntero 'tope' al siguiente nodo de abajo
        tope = tope.siguiente; // Salta al siguiente nodo, eliminando el tope actual
        return pizzaRetornar; // Retorna la pizza que estaba en el tope
    }

    /**
     * Permite visualizar la pizza en el tope sin retirarla.
     */
    public Pizza peek() {
        if (isEmpty()) {
            return null;
        }
        return tope.pizza;
    }

    /**
     * Valida si la pila se encuentra vacía.
     */
    public boolean isEmpty() {
        return tope == null;
    }
}
