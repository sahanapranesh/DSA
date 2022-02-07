package test;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class MultiThreading {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<ThreadTest> completableFuture = new CompletableFuture<>();
        completableFuture.get();
        completableFuture.whenComplete((threadTest, throwable) -> threadTest.end());
    }

    public static class ThreadTest implements Runnable {
        @Override
        public void run() {
            System.out.println("Running thread" + Thread.currentThread().getName());
        }

        public void end(){
            System.out.println("end");
        }
    }
}
