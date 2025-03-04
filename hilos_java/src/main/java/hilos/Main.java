package hilos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import hilos.hilos.Counter;
import hilos.hilos.Counterexecutorservice;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter contador = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                contador.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Contador final: " + contador.getCount());
    
        
       ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(new Counterexecutorservice(1, 5, "Contador 1"));
        executor.submit(new Counterexecutorservice(10, 15, "Contador 2"));
        executor.submit(new Counterexecutorservice(20, 25, "Contador 3"));

        executor.shutdown(); 

        
    }
    
}