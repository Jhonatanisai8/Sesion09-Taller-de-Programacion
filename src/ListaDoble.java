
public class ListaDoble {
    // atributos
    Nodo inicio, fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    public Nodo insertarInicio(Nodo inicio, int elemento) {
        Nodo nuevoNodo = new Nodo(elemento);
        nuevoNodo.siguiente = inicio;

        if (inicio == null) {
            fin = nuevoNodo;
            fin.siguiente = null;
        }

        if (inicio != null) {
            inicio.anterior = nuevoNodo;
        }
        inicio = nuevoNodo;
        return inicio;
    }

    public int suma(Nodo inicio) {
        Nodo aux = inicio;
        int suma = 0;

        // recorriendo la lista
        while (aux != null) {
            // sumando los nodos
            suma = suma + aux.dato;
            // avanzamos al siguiente nodo
            aux = aux.siguiente;
        }
        return suma;
    }
}
