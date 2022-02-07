package test;

public interface FunctionalInterfaceTest {
    void testRun();

    default void testRun2() {
        System.out.println("default impl");
    }
}
