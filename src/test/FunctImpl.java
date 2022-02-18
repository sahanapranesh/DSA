package test;

public class FunctImpl implements FunctionalInterfaceTest{
    @Override
    public void testRun() {
        System.out.println("test run");
    }

    public static void main(String[] args) {
        FunctImpl funct = new FunctImpl();
        funct.testRun();
        funct.testRun2();
    }

}
