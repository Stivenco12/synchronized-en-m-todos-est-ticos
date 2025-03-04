package hilos.hilos;

public class Counterexecutorservice implements Runnable {
    private int inicio;
    private int fin;
    private String nombre;

    public Counterexecutorservice(int inicio, int fin, String nombre) {
        this.inicio = inicio;
        this.fin = fin;
        this.nombre = nombre;
    }
    @Override
    public void run() {
        for (int i = inicio; i <= fin; i++) {
            System.out.println(nombre + " contando: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(nombre + " interrumpido.");
            }
        }
        System.out.println(nombre + " ha terminado.");
    }
}
