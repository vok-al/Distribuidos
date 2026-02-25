public class EjemploCompetencia {

    // Variable compartida por ambos hilos
    private static int contador = 0;

    public static void main(String[] args) {
        // 1. Creamos la instancia de la tarea (Runnable)
        TareaContador tarea = new TareaContador();

        // 2. Creamos los dos hilos y les asignamos la misma tarea
        Thread hilo1 = new Thread(tarea);
        Thread hilo2 = new Thread(tarea);

        // 3. Arrancamos los hilos
        hilo1.start();
        hilo2.start();

        try {
            // Esperamos a que ambos hilos terminen antes de imprimir el resultado
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 4. Mostramos el desastre (el resultado inconsistente)
        System.out.println("Resultado final del contador: " + contador);
        System.out.println("Resultado esperado: 20000");
    }

    // Clase interna que implementa Runnable
    static class TareaContador implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10000; i++) {
                // Sección Crítica: aquí ocurre la competencia
                contador++; 
            }
        }
    }
}