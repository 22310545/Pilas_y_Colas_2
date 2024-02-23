package pilas_y_colas;

public class Nodo {
    private int[] pila;
    private int[] cola;
    private int topPila;
    private int frenteCola;
    private int finCola;
    private final int capacidad;

    public Nodo(int capacidad) {
        this.capacidad = capacidad;
        pila = new int[capacidad];
        cola = new int[capacidad];
        topPila = -1;
        frenteCola = 0;
        finCola = -1;
    }

    public void pushPila(int dato) {
        if (topPila < capacidad - 1) {
            pila[++topPila] = dato;
            System.out.println("Dato agregado a la pila: " + dato);
        } else {
            System.out.println("La pila está llena");
        }
    }

    public int popPila() {
        if (topPila >= 0) {
            int dato = pila[topPila];
            pila[topPila--] = 0; // Limpiar el elemento eliminado
            System.out.println("Dato eliminado de la pila: " + dato);
            return dato;
        } else {
            System.out.println("La pila está vacía");
            return -1;
        }
    }

    public void enqueueCola(int dato) {
        if (finCola < capacidad - 1) {
            cola[++finCola] = dato;
            System.out.println("Dato agregado a la cola: " + dato);
        } else {
            System.out.println("La cola está llena");
        }
    }

    public int dequeueCola() {
        if (finCola >= frenteCola) {
            int dato = cola[frenteCola];
            cola[frenteCola++] = 0; // Limpiar el elemento eliminado
            System.out.println("Dato eliminado de la cola: " + dato);
            return dato;
        } else {
            System.out.println("La cola está vacía");
            return -1;
        }
    }

    public int[] getPila() {
        int[] elementosPila = new int[topPila + 1];
        for (int i = 0; i <= topPila; i++) {
            elementosPila[i] = pila[i];
        }
        return elementosPila;
    }

    public int[] getCola() {
        int[] elementosCola = new int[finCola - frenteCola + 1];
        for (int i = frenteCola; i <= finCola; i++) {
            elementosCola[i - frenteCola] = cola[i];
        }
        return elementosCola;
    }
}