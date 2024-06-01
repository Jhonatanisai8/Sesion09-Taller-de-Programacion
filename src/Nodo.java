public class Nodo {
    // atributos
    private int dato;
    private Nodo siguiente;
    private Nodo anterior;

    // constructor
    public Nodo(int elemento) {
        dato = elemento;
        siguiente = anterior = null;
    }
}
