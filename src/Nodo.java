/**
 * Representa el contenedor (eslabón) de la lista ligada.
 * Guarda el objeto Pizza y la referencia al siguiente nodo hacia abajo en la pila.
 */
public class Nodo {
    Pizza pizza;
    Nodo siguiente; // Puntero al nodo inferior

    public Nodo(Pizza pizza) {
        this.pizza = pizza;
        this.siguiente = null;
    }
}

