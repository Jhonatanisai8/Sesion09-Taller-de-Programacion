
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
}
