import java.util.Scanner;

public class App {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Listas Doblmente Enlazada");
        ListaDoble listaDoble = new ListaDoble();
        int opcion = 0;
        int elemento;
        Nodo lc  = null;
        do {
            System.out.println("Selecione una opcion: ");
            System.out.println("1. Insertar un nodo");
            System.out.println("2. Mostrar lista desde el inicio");
            System.out.println("3. Mostar lista desde el final");
            System.out.println("4. Eliminar un nodo");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                System.out.print("Ingrese el elemento a insertar: ");
                elemento = leer.nextInt();
                listaDoble.insertarInicio(lc, elemento);
                    break;
                case 2:
                System.out.println(String.valueOf(listaDoble.suma(lc)));
                    break;
                case 3:
                System.out.println(String.valueOf(listaDoble.sumaAtras(lc)));
                    break;
                case 4:
                System.out.print("Ingrese el elemento a eliminar: ");
                elemento = leer.nextInt();
                listaDoble.eliminarNodo(lc, elemento);
                    break;
                case 5:
                System.out.println("Gracias por participar");
                    break;
                default:
                System.out.println("Ingrese una opcion valida");
                    break;
            }
        } while (opcion != 4);

    }
}
