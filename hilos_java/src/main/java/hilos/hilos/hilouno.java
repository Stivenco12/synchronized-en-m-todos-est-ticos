package hilos.hilos;

public class hilouno extends Thread {
    public void run(){
        for (int i = 1; i <= 5; i++){
            System.out.println("ejecutando hilo " + i);
            try{
                Thread.sleep(0);
            }catch(InterruptedException e){
                System.out.println("hilo interrumpido");
            }
        }
    }
}
