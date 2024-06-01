public class Nodo {
    // atributos
    private int dato;
    Nodo siguiente;
    Nodo anterior;

    // constructor
    public Nodo(int elemento) {
        dato = elemento;
        siguiente = anterior = null;
    }
}
