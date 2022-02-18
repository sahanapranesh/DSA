package test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton {
    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() throws InterruptedException {
        if (singleton == null) {
            Thread.sleep(2000);
            singleton = new Singleton();
        }
        return singleton;
    }

    public static void main(String[] args) {
        CompletableFuture completableFuture = CompletableFuture.runAsync(new SingletonTestThread());
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        try {
            completableFuture.get();
            SingletonTestThread singletonTestThread = new SingletonTestThread();
            executorService.execute(singletonTestThread);
            executorService.execute(singletonTestThread);
            executorService.execute(singletonTestThread);
            executorService.execute(singletonTestThread);
            executorService.execute(singletonTestThread);
            executorService.execute(singletonTestThread);
            executorService.execute(singletonTestThread);
            executorService.execute(singletonTestThread);
            executorService.execute(singletonTestThread);
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        } finally{
            executorService.shutdown();
        }
    }

}

class SingletonTestThread extends Thread {
    @Override
    public void run() {
        Singleton singleton = null;
        try {
            singleton = Singleton.getInstance();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Instance is=" + singleton.hashCode()+ " in thread=" +Thread.currentThread().getName());
    }
}
