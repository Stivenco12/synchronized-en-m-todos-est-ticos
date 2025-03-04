package hilos.hilos;

public class hilorunebol implements Runnable{
    public void run(){
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ejecutando hilo: " + i);
            try {
                Thread.sleep(0); 
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido");
            }
        }
    }
}
