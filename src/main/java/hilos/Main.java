package hilos;

import hilos.hilos.Counter;

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
    }
}