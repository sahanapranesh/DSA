package test;

public class ExceptionTest {

    public static void display(){
        System.out.println("Inside display");
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try{
            System.out.println("Main");
            display();
        }
        catch(Exception e){
            System.out.println("Caught");
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("exit");
    }
}
