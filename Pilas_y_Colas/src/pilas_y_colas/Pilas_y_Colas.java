package pilas_y_colas;
import java.util.Scanner;

public class Pilas_y_Colas {

    public static void main(String[] args) {
         Nodo nodo = new Nodo(5);
        int opcion;
        int dato;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar dato a la pila");
            System.out.println("2. Eliminar dato de la pila");
            System.out.println("3. Mostrar datos de la pila");
            System.out.println("4. Agregar dato a la cola");
            System.out.println("5. Eliminar dato de la cola");
            System.out.println("6. Mostrar datos de la cola");
            System.out.println("7. Salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato para la pila: ");
                    dato = scanner.nextInt();
                    nodo.pushPila(dato);
                    break;
                case 2:
                    nodo.popPila();
                    break;
                case 3:
                    System.out.println("Datos de la pila:");
                    mostrarDatos(nodo.getPila());
                    break;
                case 4:
                    System.out.print("Ingrese el dato para la cola: ");
                    dato = scanner.nextInt();
                    nodo.enqueueCola(dato);
                    break;
                case 5:
                    nodo.dequeueCola();
                    break;
                case 6:
                    System.out.println("Datos de la cola:");
                    mostrarDatos(nodo.getCola());
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 7);

        // Cerrar el scanner al salir del bucle
        scanner.close();
    }

    private static void mostrarDatos(int[] datos) {
        if (datos.length == 0) {
            System.out.println("La estructura está vacía.");
            return;
        }

        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }
        System.out.println();
    }
}
    
