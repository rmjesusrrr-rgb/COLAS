package ejercicio_ed_2_discoduroderoer;

public class Main {
    public static void main(String[] args) {
        ColaDinamica<Integer> cola = new ColaDinamica<>();

        System.out.println("=== PRUEBA DE COLA DINÁMICA ===");
        System.out.println("¿La cola está vacía? " + cola.isEmpty());

        System.out.println("\n--- Insertando elementos (enqueue) ---");
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);
        cola.enqueue(40);

        System.out.println("Elementos en la cola: " + cola);
        System.out.println("Tamaño de la cola: " + cola.size());
        System.out.println("Primer elemento (frente): " + cola.primero());

        System.out.println("\n--- Extrayendo elementos (dequeue) ---");
        System.out.println("Elemento extraído: " + cola.dequeue());
        System.out.println("Elemento extraído: " + cola.dequeue());

        System.out.println("\n--- Estado actual de la cola ---");
        System.out.println("Elementos en la cola: " + cola);
        System.out.println("Tamaño actual: " + cola.size());
        System.out.println("Primer elemento actual: " + cola.primero());
        System.out.println("¿La cola está vacía? " + cola.isEmpty());
    }
}
