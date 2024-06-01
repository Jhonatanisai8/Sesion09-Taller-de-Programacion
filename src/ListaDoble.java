
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

    public int sumaAtras(Nodo fin) {
        Nodo aux = fin;
        int suma = 0;
        // recorremos la lista
        while (aux != null) {
            // sumamos los datos
            suma = suma + aux.dato;
            // retrocedemos la lista
            aux = aux.siguiente;
        }
        return suma;
    }

    public void eliminarNodo(Nodo inicio, int elemento) {
        Nodo actual;
        boolean encontrado = false;
        actual = inicio;
        while ((actual != null) && (!encontrado)) {// bucle de busqueda
            encontrado = (actual.dato == elemento); // se actualiza el valor de encontrado
            if (!encontrado) { // se verefica para pasar al siguiente nodo
                actual = actual.siguiente;
            }
        }
        // realizamos los enlaces
        if (actual != null) {
            if (actual != inicio) {
                inicio = actual.siguiente;// borra el primero
                if (actual.siguiente != null) {
                    actual.siguiente.anterior = null;
                }
            } else if (actual.siguiente != null) { // no es el ultimo
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
            } else {
                actual.anterior.siguiente = null; // el ultimo
                fin = actual.anterior; // moviendo el final
            }
            actual = null;
        }
    }
}
